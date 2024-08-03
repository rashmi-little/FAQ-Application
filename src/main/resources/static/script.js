const faqs = document.querySelectorAll('.faq');
faqs.forEach(faq => faq.addEventListener('click', clickHandler));

function clickHandler(e) {
    let parent = e.target;

    if(!parent.classList.contains('faq')) {
        parent = parent.closest('.faq');
    }
    parent.querySelector('.answer').classList.toggle('hidden');
    parent.classList.toggle('answer-color');
    const symbol = parent.querySelector('.symbol')
    symbol.textContent = symbol.textContent == '+' ? '-' : '+';
}