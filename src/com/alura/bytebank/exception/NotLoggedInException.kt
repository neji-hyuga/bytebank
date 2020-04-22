package com.alura.bytebank.exception

class NotLoggedInException(
    message: String = "you're not logged in, log in and try again"
) : Exception(message)