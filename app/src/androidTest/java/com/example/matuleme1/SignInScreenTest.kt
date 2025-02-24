package com.example.matuleme1

import android.app.Dialog
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.matuleme1.ui.screen.signin.SignInViewModule
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class SignInScreenTest {

    private val signInViewModule = SignInViewModule()

    @Test
    fun testValidateEmail() {
        assertTrue(signInViewModule.validateEmail("test@example.com"))
    }

    @Test
    fun testValidatePassword() {
        assertTrue(signInViewModule.validatePassword("StrongPass123"))
    }

    @Test
    fun testSuccessLogin() {
        assertTrue(
            signInViewModule.login("test@example.com", "StrongPass123")
        )
    }

    @Test
    fun testFailedLogin() {
        assertFalse(
            signInViewModule.login("email", "123")
        )
    }

    @Test
    fun testShowDialogueWindowForInvalidEmail() {
        assertFalse(signInViewModule.validateEmail("invalid-email"))
    }

    @Test
    fun testShowDialogueWindowForInvalidPassword() {
        assertFalse(signInViewModule.validatePassword("weak"))
    }
}