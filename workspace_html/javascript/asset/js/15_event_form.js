window.addEventListener('load', function(){

    const log = this.document.querySelector('#log')

    window.addEventListener('resize', function(){
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
    site.addEventListener('change', ()=>{
        console.log( site.value )

        if(site.value == 1){
            // naver
            from.setAttribute('action', 'https://search.naver.com/search.naver')
        } else if(site.value == 2){
            // google
            from.setAttribute('action', 'https://www.google.com/search')
        }
    })

    from.addEventListener('submit', function(event){

        // html 태그의 고유(기본) 기능을 막아준다
        // 여기서는 submit의 기능을 막음
        event.preventDefault()

        // 검색어가 두글자 이하면
        if(id.value.length <= 2){
             alert('검색어는 두글자 이상입니다')
        } else {
            from.submit()
        }
    })

    addEventListener('copy', function(event){
        event.preventDefault()
        this.alert('복사금지')
    })
    addEventListener('selectstart', function(event){
        event.preventDefault()
    // }, true)
    })

    document.querySelector('#parent')
        .addEventListener('click', function(event){
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
        .addEventListener('click', function(event){
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
    for(let i=0; i<trs.length; i++){
        trs[i].addEventListener('click', function(event){

            // 7. 무조건 제목의 내용이 출력되게
            console.log(event.currentTarget.querySelector('.title').textContent)
            
            //8. 체크박스를 눌렀을때만 제목이 안나오게
            // if(!event.target.classList.contains('chk')){
            //     console.log(event.currentTarget.querySelector('.title').textContent)
            // } 
        })

        trs[i].querySelector('input.chk')
            .addEventListener('click', function(event){
                event.stopPropagation()

                // 부모로 이동
                console.log('this.parentNode :', this.parentNode)
                console.log('this.parentNode.parentNode :', this.parentNode.parentNode)

                // 9. checkbox를 클릭했을 때 그 줄의 제목을 출력하시오
                if(event.target.classList.contains('chk')){
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
    
    enter.addEventListener('click', function(event){
        const checkedSelect = document.querySelector('#pizza_select option:checked').innerText
        const checkedSize = document.querySelector('input[name="size"]:checked')
        const checkedEdge = document.querySelector('input[name="edge"]:checked')
        const checkedTopping = document.querySelectorAll('input[name="topp"]:checked')
        const price = document.querySelector('#price')
        let sumTopping = 0
        let topping = "";
        for(let i=0; i<checkedTopping.length; i++){
            sumTopping += Number(checkedTopping[i].value)
            console.log(Number(checkedTopping[i].value))
            if(i == 0){
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

    // 문제4
    // 인기상품순, 낮은가격순, 높은가격순, 신상품순 메뉴에서
    // 클릭한 것만 굵은 글씨로 유지

    // 문제5
    // 썸네일이 있는 쇼핑몰
    // 썸네일에 마우스 올리면 
    // 썸네일의 이미지를 오른쪽에 크게 보여준다

})

console.log('밖에서 this', this)
console.log('밖에서 window', this === window)
