window.addEventListener('load', bind);

function bind() {
    const btn1 = document.querySelector('#btn1')
    btn1.addEventListener('click', function () {

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식 method, 주소
        // json 연습 주소 : https://jsonplaceholder.typicode.com/users
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users')

        // 보내기
        xhr.send()
        console.log(0, xhr.responseText)

        xhr.onload = function () { // 다녀오는게 끝났을 때 실행
            console.log('다녀왔어')
            console.log(xhr.responseText)

            // 깜짝 퀴즈
            // 두번째 사람의 이름을 출력한다
            // 세번째 사람의 lat를 출력한다

            const json = JSON.parse(xhr.responseText)
            console.log(json)
            console.log('두번째 사람의 이름 :', json[1].name)
            console.log('세번째 사람의 lat :', json[2].address.geo.lat)
        }

    })

    document.querySelector('#btn2').addEventListener('click', function () {
        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식 method, 주소
        xhr.open('get', './17_json.html')

        // 보내기
        xhr.send()
        console.log(0, xhr.responseText)

        xhr.onload = function () { // 다녀오는게 끝났을 때 실행
            console.log(xhr.responseText)
        }
    })

    document.querySelector('#btn3').addEventListener('click', function () {
        const xhr = new XMLHttpRequest();

        const key = '3b35e0570f745df3e6807d4f0ae7643a30aa406dee6932f1b419508d8d2e5963'
        let url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst'
        url += '?serviceKey=' + key
        url += '&numOfRows=1000'
        url += '&pageNo=1'
        url += '&dataType=JSON'
        url += '&base_date=20260212'
        url += '&base_time=1300'
        url += '&nx=63'
        url += '&ny=110'


        xhr.open('get', url)
        xhr.send()

        xhr.onload = function () {
            // console.log(xhr.responseText)
            let json = JSON.parse(xhr.responseText)
            console.log(json)

            // 1.첫번째 자료의 category, fcstValue 출력
            // 2. T1H(기온), RN1(강수량), REH(습도) 모두 출력

            // 이렇게도 해보자
            // let json1 = {
            //     '1400': {
            //         T1H: 8,
            //         RN1: '강수없음',
            //         REH: 45
            //     },
            //     '1500': {
            //         T1H: 8,
            //         RN1: '강수없음',
            //         REH: 45
            //     },
            // }
            // console.log(json1['1400']['T1H'])
            // if(!json1['1700']){
            //     json1['1700'] = {}
            // }
            // 3. 2번 내용을 html에 테이블로 출력

            console.log('item[0].category :', json.response.body.items.item[0].category)
            console.log('item[0].fcstValue', json.response.body.items.item[0].fcstValue)

            let function1 = function () {
                // let table = document.querySelector('#table')
                let data = document.querySelector('#tbody')
                for (let i = 0; i < json.response.body.items.item.length; i++) {
                    if (json.response.body.items.item[i].category === 'T1H') {
                        console.log('category === T1H :', json.response.body.items.item[i])
                        // table.innerHTML += `
                        //     <table style="border: 1px solid;">
                        //         <tr>
                        //             <td>${json.response.body.items.item[i].baseDate}</td>
                        //             <td>${json.response.body.items.item[i].baseTime}</td>
                        //             <td>${json.response.body.items.item[i].category}</td>
                        //             <td>${json.response.body.items.item[i].fcstDate}</td>
                        //             <td>${json.response.body.items.item[i].fcstTime}</td>
                        //             <td>${json.response.body.items.item[i].fcstValue}</td>
                        //             <td>${json.response.body.items.item[i].nx}</td>
                        //             <td>${json.response.body.items.item[i].ny}</td>
                        //         </tr>
                        //     </table>
                        // `
                        data.innerHTML += `
                            <tr>
                                <td>${json.response.body.items.item[i].baseDate}</td>
                                <td>${json.response.body.items.item[i].baseTime}</td>
                                <td>${json.response.body.items.item[i].category}</td>
                                <td>${json.response.body.items.item[i].fcstDate}</td>
                                <td>${json.response.body.items.item[i].fcstTime}</td>
                                <td>${json.response.body.items.item[i].fcstValue}</td>
                            </tr>
                        `

                        
                    }
                    if (json.response.body.items.item[i].category === 'RN1') {
                        console.log('category === RN1 :', json.response.body.items.item[i])
                    }
                    if (json.response.body.items.item[i].category === 'REH') {
                        console.log('category === REH :', json.response.body.items.item[i])
                    }

                }
            }

            function1();

        }
    })

    const btn4 = document.querySelector('#btn4')
    btn4.addEventListener('click', function () {

        const xhr = new XMLHttpRequest();

        // xhr.open('get', 'https://jsonplaceholder.typicode.com/users')
        // xhr.send()
        // xhr.onload = function () { 
        //     console.log(xhr.responseText)
        //     let json = JSO
        // }

        const url = 'https://jsonplaceholder.typicode.com/users'
        const option = {
            method: 'get'
        }

        fetch(url, option)
        .then(function(response){
            return response.json()
        })
        .then(function(json){
            console.log(json)
        })
        .catch(function(error){
            console.error(error)
        })

    })



}