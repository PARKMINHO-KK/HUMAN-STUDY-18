window.addEventListener('load', function () {

    const log = this.document.querySelector('#log')

    window.addEventListener('resize', function () {
        const w = window.innerWidth;
        const h = window.innerHeight;

        log.innerHTML = `<br>너비${w}, 높이${h}` + log.innerHTML;
    })

    const id = document.querySelector('#id')
    id.addEventListener('focus', function () {
        id.style.backgroundColor = 'yellow'
    })
    id.addEventListener('blur', function () {
        id.style.backgroundColor = ''
    })
    // input text등이 변경될 때 마다
    id.addEventListener('input', function () {
        const r = parseInt(Math.random() * 256)
        const g = parseInt(Math.random() * 256)
        const b = parseInt(Math.random() * 256)
        const a = Math.random()

        id.style.backgroundColor = `rgda(${r},${g},${b},${a})`
    })

    const from = this.document.querySelector('form')
    const site = this.document.querySelector('#site')
    site.addEventListener('change', () => {
        console.log(site.value)

        if (site.value == 1) {
            // naver
            from.setAttribute('action', 'https://search.naver.com/search.naver')
        } else if (site.value == 2) {
            // google
            from.setAttribute('action', 'https://www.google.com/search')
        }
    })

    from.addEventListener('submit', function (event) {

        // html 태그의 고유(기본) 기능을 막아준다
        // 여기서는 submit의 기능을 막음
        event.preventDefault()

        // 검색어가 두글자 이하면
        if (id.value.length <= 2) {
            alert('검색어는 두글자 이상입니다')
        } else {
            from.submit()
        }
    })

    addEventListener('copy', function (event) {
        event.preventDefault()
        this.alert('복사금지')
    })
    addEventListener('selectstart', function (event) {
        event.preventDefault()
        // }, true)
    })

    document.querySelector('#parent')
        .addEventListener('click', function (event) {
            console.log('부모 클릭')

            // event.target : 실제 이벤트가 발생한 DOM
            console.log('event.target :', event.target)

            // event.currentTarget : 이벤트가 적용되어 있는 DOM
            console.log('event.currentTarget :', event.currentTarget)

            console.log('this', this)
            console.log('this 같음?', this === event.currentTarget)
            // 화살표 함수(arrow)인 경우 this를 변경하지 않음
            // 즉 this === window
        })

    document.querySelector('#child1')
        .addEventListener('click', function (event) {
            // 전파 방지
            // 부모로 전달되는 이벤트 중지
            // event.stopPropagation()
            console.log('자식1 클릭')
        })

    // 같이 해보자
    // 1. table 태그에 click 이벤트 주기
    // 2. click된 dom을 출력
    // 3. DOM.classList.contains('click')로
    // 4. 체크박스일 경우만 벨류 출력

    // document.querySelector('#board')
    //     .addEventListener('click', function(event){
    //         console.log(event.target)

    //         if(event.target.classList.contains('chk')){
    //             console.log(event.target.value)
    //         }

    //         // 5. 제목을 클릭했을 때만 내용을 출력
    //         if(event.target.classList.contains('title')){
    //             console.log(event.target.innerText)
    //         }
    //     })
    // 6. 이제 table에 위임하지 않고
    // tr에 위임하게 해주세요

    const trs = document.querySelectorAll('#board tr')
    for (let i = 0; i < trs.length; i++) {
        trs[i].addEventListener('click', function (event) {

            // 7. 무조건 제목의 내용이 출력되게
            console.log(event.currentTarget.querySelector('.title').textContent)

            //8. 체크박스를 눌렀을때만 제목이 안나오게
            // if(!event.target.classList.contains('chk')){
            //     console.log(event.currentTarget.querySelector('.title').textContent)
            // } 
        })

        trs[i].querySelector('input.chk')
            .addEventListener('click', function (event) {
                event.stopPropagation()

                // 부모로 이동
                console.log('this.parentNode :', this.parentNode)
                console.log('this.parentNode.parentNode :', this.parentNode.parentNode)

                // 9. checkbox를 클릭했을 때 그 줄의 제목을 출력하시오
                if (event.target.classList.contains('chk')) {
                    console.log(this.parentNode.parentNode.querySelector('.title').innerText)
                }

            })
    }

    // 문제 1
    // 로그인 창에서
    // 아디/비번 없으면 글씨 나오게
    // const login_id = document.querySelector('#id_q1')
    // const login_pw = document.querySelector('#pw')
    // const login_lg = document.querySelector('#login')
    // const login_statu = document.querySelector('#statu')

    // login_lg.addEventListener('click', function(event){
    //     if(login_id.value.trim() == ""){
    //         login_statu.innerText = '아이디를 입력해 주세요'
    //     } else if(login_pw.value.trim() == ""){
    //         login_statu.innerText = '비밀번호를 입력해 주세요'
    //     } else{
    //         login_statu.innerText = ''
    //     }
    // })

    // 문제2
    // 피자 주문
    // 피자 종류 선택 select
    //    치즈피자, 불고기피자, 페퍼로니피자, 콤비네이션피자
    // 사이즈 선택 radio
    //    small(18000), medium(20000), large(22000)
    // 도우 엣지 선택 radio
    //    thin(0), 치즈(0), 고구마(0), 에그타르트(0), 소보로(0)
    // 토핑 checkbox
    //    감자(2000), 올리브(500), 페퍼로니(1000), 
    //    고구마(2000), 새우(5000), 베이컨(3000), 파인애플(500) 
    // [확인] 버튼 클릭 시
    // 문제 2-1 : 총액 출력
    // 문제 2-2 : 선택 내역과 총액 출력

    // console.log(sumTopping)
    const enter = document.querySelector('#button')

    enter.addEventListener('click', function (event) {
        const checkedSelect = document.querySelector('#pizza_select option:checked').innerText
        const checkedSize = document.querySelector('input[name="size"]:checked')
        const checkedEdge = document.querySelector('input[name="edge"]:checked')
        const checkedTopping = document.querySelectorAll('input[name="topp"]:checked')
        const price = document.querySelector('#price')
        let sumTopping = 0
        let topping = "";
        for (let i = 0; i < checkedTopping.length; i++) {
            sumTopping += Number(checkedTopping[i].value)
            console.log(Number(checkedTopping[i].value))
            if (i == 0) {
                topping = checkedTopping[i].parentNode.innerText
            } else {
                topping += ", " + checkedTopping[i].parentNode.innerText;
            }
        }
        let sumPrice = Number(checkedSize.value) + Number(checkedEdge.value) + sumTopping
        price.innerText = `
            총가격 : ${sumPrice}
            주문내역 : 
            종류 : ${checkedSelect}
            사이즈 : ${checkedSize.parentNode.innerText}
            도우 엣지 : ${checkedEdge.parentNode.innerText}
            토핑 : ${topping}
            `;
    })



    // 문제3
    // 주문과 배송
    // 주문 정보 : 이름, 주소
    // 배송 정보 : 이름, 주소
    //      - ㅁ 주문 정보와 배송 정보가 같습니다
    // 체크하면 주문 정보가 배송 정보로 복사
    // 체크 풀면 배송 정보 초기화

    const info = document.querySelector('.info')
    const check_q3 = document.querySelector('#q3')
    const order = document.querySelector('.order')

    check_q3.addEventListener('click', function (event) {

        const checked_q3 = document.querySelector('input[name="information"]:checked')

        if (checked_q3) {
            order.innerText = "\n" + info.innerText
        } else {
            order.innerText = ""
        }
    })


    // 문제4
    // 인기상품순, 낮은가격순, 높은가격순, 신상품순 메뉴에서
    // 클릭한 것만 굵은 글씨로 유지

    const list_q4 = document.querySelector('#list_q4')
    const liAll_q4 = list_q4.querySelectorAll('li')

    list_q4.addEventListener('click', function (event) {
        for (let i = 0; i < liAll_q4.length; i++) {
            liAll_q4[i].innerHTML = liAll_q4[i].innerText
        }

        if (event.target.tagName === 'LI') {
            event.target.innerHTML = '<strong>' + event.target.innerText + '</strong>'
        }
    })

    // 문제5
    // 썸네일이 있는 쇼핑몰
    // 썸네일에 마우스 올리면 
    // 썸네일의 이미지를 오른쪽에 크게 보여준다

    /*
        전략
        1. div 왼쪽, 오른쪽 2개로 클래스 줘서 쪼갬
        2. 왼쪽 div 넓이 좁게줘서 작은사진들 세로로 인라인블럭
        3. 오른쪽에 큰사진 1장
        4. js에 mouseover사용해서 올라갔을때 innerHTML 내용바꿈
    */

    let simg = document.querySelector('.left')
    let bimg = document.querySelector('.right img')
    // let currImg = null;

    simg.addEventListener('mouseover', function(event){ // 마우스가 올라갔을때 이벤트 발생
        if(event.target.tagName === 'IMG'){ // 이벤트 타겟이 이미지 태그일때만 주소 바꿔줌
            // currImg = event.target.src
            // bimg.src = currImg
            bimg.src = event.target.src
        }
        // currImg = event.target.src // 부모 div에 위임한 상태이기 때문에 img를 벗어나면 target이 div로 바뀜
        // bimg.src = currImg // 404 에러 발생
    })

    // 문제6
    // 할일을 적는 input, 추가 버튼
    // 6-1 추가 버튼을 누르면
    //      체크박스와 할일이 하단에 추가된다
    // 6-2 개별 삭제 버튼이 있고
    //      삭제 버튼 클릭 시 그 줄이 지워진다
    // 6-3 전체 선택 checkbox가 있고
    //      전체 선택 체크 시 모든 checkbox 체크
    //      전체 선택 체크 해제 시 모든 checkbox 체크 해제
    // 6-4 전체 선택 후 하나라도 해제되면 전체 선택도 해제
    //      모든 항목이 체크 되어있다면 전체 선택도 체크
    // 6-5 선택 삭제 버튼 클릭 시 선택된 내용만 삭제

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
