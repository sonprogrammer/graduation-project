// 관리자 버튼 클릭 이벤트 처리
const adminBtn = document.getElementById('admin-btn');

adminBtn.addEventListener('click', () => {
    const password = prompt('비밀번호를 입력하세요');
    if (password === '비밀번호') {
        // 팝업창에 들어갈 내용 작성
        alert('관리자 페이지로 이동합니다.');
    } else {
        alert('비밀번호가 틀렸습니다.');
    }
});