package com.example.presentation.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.example.common.either.Either
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseFragment<VB : ViewBinding, VM : BaseViewModel>(@LayoutRes private val layoutId: Int) :
    Fragment(layoutId) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListeners()
        setupSubscribes()
        setupRequests()
    }

    protected open fun initialize() {

    }

    protected open fun setupListeners() {

    }

    protected open fun setupSubscribes() {

    }

    protected open fun setupRequests() {

    }

    protected open fun <T> Flow<Either<String, T>>.subscribe(
        onError: (error: String) -> Unit,
        onSuccess: ((data: T) -> Unit),
    ) {
        lifecycleScope.launch {
            collect {
                when (it) {
                    is Either.Left -> {
                        onError(it.message.toString())
                    }
                    is Either.Right -> {
                        it.data?.let { data ->
                            onSuccess(data)
                        }
                    }
                }
            }
        }
    }
}