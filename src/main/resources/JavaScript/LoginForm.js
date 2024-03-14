document.getElementById("popupBtn").addEventListener("click", function() {
    document.getElementById("popup").style.display = "block";
});

document.addEventListener("click", function(event) {
    if (event.target.closest("#popup") === null && event.target.id !== "popupBtn") {
        document.getElementById("popup").style.display = "none";
    }
});

window.addEventListener('scroll', function() {
    var scrollPosition = window.scrollY;
    var parallaxContainer = document.querySelector('.container');
    var parallaxOffset = scrollPosition * 0.5;

    parallaxContainer.style.backgroundPositionY = -parallaxOffset + 'px';
});
