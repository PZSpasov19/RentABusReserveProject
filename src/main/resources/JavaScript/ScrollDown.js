document.addEventListener('DOMContentLoaded', function() {
    var button = document.getElementById('scrollDownButton');

    button.addEventListener('click', function() {
        window.scrollBy({
            top: window.innerHeight,
            behavior: 'smooth'
        });
    });

    // Show the button when scrolling down, hide when at the top
    window.addEventListener('scroll', function() {
        if (window.scrollY > 0) {
            button.style.display = 'block';
        } else {
            button.style.display = 'none';
        }
    });
});
