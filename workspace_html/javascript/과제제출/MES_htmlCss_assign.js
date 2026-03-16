window.addEventListener('load', function () {

    // 전략
    /*
        1. html 만들기
        2. 추가 버튼을 클릭이벤트 넣어서
        3. .addedList에 innerHTML += 로 중복추가
        4. 추가할 때 선택 체크박스랑 개별삭제 버튼 넣기
        5. 개별삭제버튼 클릭이벤트 발생 시 parentNode로 target.event써서 innerHTML = ""로
        6. 체크하면 최소선 parentNode로 target.event써서 event.target.style.textDecoration = 'line-through'
        7. 체크해제하면 event.target.style.textDecoration = ''
        8. 전체선택/해제는 반복문
    */

    const addButton = document.querySelector('#addList') // 추가버튼
    let addedList = document.querySelector('.addedList') // 할일추가
    const selectAll = document.querySelector('#selectAll') // 전체선택
    const selectDel = document.querySelector('#selectDel') // 선택삭제

    addButton.addEventListener('click', function (event) {  // 추가버튼 클릭이벤트 발생시
        // addedList = document.querySelector('.addedList')
        let addText = document.querySelector('#todoText')
        addedList.innerHTML += `
        <div>
                <input type="checkbox">${addText.value}
                <input type="button" style="margin-left: 20px;" value="삭제" k="delete">
                </div>
                `
        addText.value = ""; // 입력 후 초기화
    })

    addedList.addEventListener('click', function (event) { // (위임)추가된 할일목록 클릭이벤트 발생 시
        // if (event.target.getAttribute('type') === 'checkbox') {
        if (event.target.type === 'checkbox') { // 발생한 이벤트태그의 타입이 체크박스일 때
            if (event.target.checked) { // 체크되었으면
                event.target.parentNode.style.textDecoration = 'line-through'; //취소선 만들기
            } else {
                event.target.parentNode.style.textDecoration = ''; //취소선 없애기
            }
        
            let check = document.querySelectorAll('.addedList input[type="checkbox"]') // 추가된 할일 체크박스 모두 배열로
            let checked = document.querySelectorAll('.addedList input[type="checkbox"]:checked') // 추가된 할일 중 체크된것만
            if(check.length == checked.length){ // 체크박스 갯수와 체크된 갯수가 같을 때
                selectAll.checked = true; // 전체선택 체크박스 체크
            } else { // 다를 때
                selectAll.checked = false;
            }
        }

        if (event.target.getAttribute('k') === "delete") { // 할일목록에서 삭제버튼 누를 시
            event.target.parentNode.remove(); // DOM 삭제
            console.log('m')
        }
    });

    selectAll.addEventListener('click', function (event) { // 전체선택버튼 클릭이벤트 발생시
        let arrAdded = document.querySelectorAll('.addedList input[type="checkbox"]') // 배열의 체크박스들만 선택
        if (this.checked) { // 현재 익명함수 안에서의 this는 selectAll을 의미함
            for (let i = 0; i < arrAdded.length; i++) { // 현재까지 추가된 모든 할일목록 반복문
                arrAdded[i].checked = true; // true 대신에 1도 가능
                arrAdded[i].parentNode.style.textDecoration = 'line-through';
            }
        } else {
            for (let i = 0; i < arrAdded.length; i++) {
                arrAdded[i].checked = false; // false 대신에 0도 사용가능
                arrAdded[i].parentNode.style.textDecoration = '';
            }
        }
    })
    
    selectDel.addEventListener('click', function (event) { // 선택삭제버튼 이벤트 발생시
        let arrDelete = document.querySelectorAll('.addedList input[type="checkbox"]') // 배열의 체크박스들만 선택
        for (let i = 0; i < arrDelete.length; i++) { // 배열길이만큼 반복문 돌면서
            if (arrDelete[i].checked) {
                    arrDelete[i].parentNode.remove(); // 체크된 체크박스의 div만 없애기
            }
        }
    })

})

console.log('밖에서 this', this)
console.log('밖에서 window', this === window)
