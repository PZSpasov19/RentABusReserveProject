document.addEventListener("DOMContentLoaded", function() {
    var loginBtn = document.getElementById("loginBtn");
    var loginForm = document.getElementById("loginForm");

    loginBtn.addEventListener("click", function() {
        // Toggle the visibility of the login form
        loginForm.style.display = loginForm.style.display === "block" ? "none" : "block";
    });
});
loginBtn.addEventListener("click", function() {
    console.log("Button clicked");
    // Toggle the visibility of the login form
    loginForm.style.display = loginForm.style.display === "block" ? "none" : "block";
});
