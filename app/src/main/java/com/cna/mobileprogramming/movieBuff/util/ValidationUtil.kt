package com.cna.mobileprogramming.movieBuff.util

import com.cna.mobileprogramming.movieBuff.model.Movie

object ValidationUtil {

    fun validateMovie(movie: Movie) : Boolean {
        if (movie.name.isNotEmpty() && movie.category.isNotEmpty()) {
            return true
        }
        return false
    }
}