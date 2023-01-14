package com.example.presentation.ui.fragments.answer

import android.view.View
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.presentatio.R
import com.example.presentatio.databinding.FragmentAnswerBinding
import com.example.presentation.base.BaseFragment

class AnswerFragment :
    BaseFragment<FragmentAnswerBinding, AnswerViewModel>(R.layout.fragment_answer) {

    override val binding by viewBinding(FragmentAnswerBinding::bind)
    override val viewModel: AnswerViewModel by viewModels()
    private val saveArgs: AnswerFragmentArgs by navArgs()

    override fun initialize() {
        binding.explanationTitleTv.visibility = View.INVISIBLE
        binding.explanationTv.visibility = View.INVISIBLE
    }

    override fun setupListeners() = with(binding) {
        answerATv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerBTv.visibility = View.GONE
                answerCTv.visibility = View.GONE
                answerDTv.visibility = View.GONE
                answerETv.visibility = View.GONE
                answerFTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        answerBTv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerATv.visibility = View.GONE
                answerCTv.visibility = View.GONE
                answerDTv.visibility = View.GONE
                answerETv.visibility = View.GONE
                answerFTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        answerCTv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerATv.visibility = View.GONE
                answerBTv.visibility = View.GONE
                answerDTv.visibility = View.GONE
                answerETv.visibility = View.GONE
                answerFTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        answerDTv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerATv.visibility = View.GONE
                answerCTv.visibility = View.GONE
                answerBTv.visibility = View.GONE
                answerETv.visibility = View.GONE
                answerFTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        answerETv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerATv.visibility = View.GONE
                answerCTv.visibility = View.GONE
                answerDTv.visibility = View.GONE
                answerBTv.visibility = View.GONE
                answerFTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        answerFTv.setOnClickListener {
            if (saveArgs.correctAnswer == answerATv.text.toString()) {
                Toast.makeText(context, "Правильно +1 балл", Toast.LENGTH_LONG).show()
                viewModel.setBallsUseCase(viewModel.getBalls()+1)
            } else {
                Toast.makeText(context, "Неправильно", Toast.LENGTH_LONG).show()
                explanationTv.text = saveArgs.explanation
                explanationTitleTv.visibility = View.VISIBLE
                explanationTv.visibility = View.VISIBLE
                answerATv.visibility = View.GONE
                answerCTv.visibility = View.GONE
                answerDTv.visibility = View.GONE
                answerETv.visibility = View.GONE
                answerBTv.visibility = View.GONE
                closeBtn.setBackgroundResource(R.color.orange)
            }
        }
        closeBtn.setOnClickListener {
            findNavController().navigate(
                AnswerFragmentDirections.actionAnswerFragmentToHomeFragment()
            )
        }
    }
}