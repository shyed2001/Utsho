document.addEventListener('DOMContentLoaded', function() {
  const faqElements = document.querySelectorAll('.faq');

  faqElements.forEach(faq => {
    const question = faq.querySelector('.question');
    const answer = faq.querySelector('.answer');
    
    question.addEventListener('click', () => {
      faq.classList.toggle('active');
      answer.style.display = faq.classList.contains('active') ? 'block' : 'none';
    });
  });
});
