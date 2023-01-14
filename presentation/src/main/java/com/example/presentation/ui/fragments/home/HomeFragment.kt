package com.example.presentation.ui.fragments.home

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.presentatio.R
import com.example.presentatio.databinding.FragmentHomeBinding
import com.example.presentation.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {
    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel: HomeViewModel by viewModels()
    private var isEasy = true
    private var isMedium = false
    private var isHard = false

    private fun toggle(easy: Boolean, medium: Boolean, hard: Boolean) = with(binding) {
        isEasy = easy
        isMedium = medium
        isHard = hard
        if (easy) {
            difficultyEasy.setBackgroundResource(R.color.black)
            difficultyMedium.setBackgroundResource(R.color.grey)
            difficultyHard.setBackgroundResource(R.color.grey)
        }
        if (medium) {
            difficultyEasy.setBackgroundResource(R.color.grey)
            difficultyMedium.setBackgroundResource(R.color.black)
            difficultyHard.setBackgroundResource(R.color.grey)
        }
        if (hard) {
            difficultyEasy.setBackgroundResource(R.color.grey)
            difficultyMedium.setBackgroundResource(R.color.grey)
            difficultyHard.setBackgroundResource(R.color.black)
        }
    }

    override fun initialize() {

    }

    override fun setupRequests() {

    }

    override fun setupListeners() = with(binding) {
        difficultyEasy.setOnClickListener {
            toggle(easy = true, medium = false, hard = false)
        }
        difficultyMedium.setOnClickListener {
            toggle(easy = false, medium = true, hard = false)
        }
        difficultyHard.setOnClickListener {
            toggle(easy = false, medium = false, hard = true)
        }
        generateAnswerBtn.setOnClickListener {
            var difficulty = ""
            when {
                isEasy -> difficulty = "Easy"
                isMedium -> difficulty = "Medium"
                isHard -> difficulty = "Hard"
            }

            viewModel.getAnswer(difficulty).subscribe(
                onError = {
                    Log.e("error", it)
                },
                onSuccess = {
                    var correctAnswer: String? = ""
                    when {
                        it.correctAnswers.answerACorrect -> {
                            correctAnswer = it.answers.answerA
                        }
                        it.correctAnswers.answerBCorrect -> {
                            correctAnswer = it.answers.answerB
                        }
                        it.correctAnswers.answerCCorrect -> {
                            correctAnswer = it.answers.answerC
                        }
                        it.correctAnswers.answerDCorrect -> {
                            correctAnswer = it.answers.answerD
                        }
                        it.correctAnswers.answerECorrect -> {
                            correctAnswer = it.answers.answerE
                        }
                        it.correctAnswers.answerFCorrect -> {
                            correctAnswer = it.answers.answerF
                        }
                    }
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToAnswerFragment(
                            it.question,
                            it.answers.answerA,
                            it.answers.answerB,
                            it.answers.answerC,
                            it.answers.answerD,
                            it.answers.answerE,
                            it.answers.answerF,
                            correctAnswer,
                            it.explanation,
                            it.description
                        )
                    )
                }
            )
        }
    }
}