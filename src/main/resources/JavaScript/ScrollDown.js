const scrollSpeed = 2;
const contentHeight = document.getElementById('content').scrollHeight;
let scrollPosition = 0;
const intervalTime = 50;

function scrollPage() {
    scrollPosition += scrollSpeed;
    if (scrollPosition >= contentHeight - window.innerHeight) {
        clearInterval(scrollInterval);
    }
    window.scroll(0, scrollPosition);
}

const scrollInterval = setInterval(scrollPage, intervalTime);