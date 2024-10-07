const navOption = document.querySelectorAll('.nav-option');

navOption.forEach(option => {
    option.addEventListener('click',()=>{
        removeActiveClass();
        option.classList.add('active');
    })
});
function removeActiveClass(){
    navOption.forEach(option=>{
        option.classList.remove('active');
    })
}