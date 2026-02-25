window.onload = function(){
    bind()
}

function bind(){
    const log = document.querySelector('#log')

    const area = document.querySelector("#area")
    // 마우스 오른쪽 버튼 방지
    area.oncontextmenu = function(){
        return false;
    }

    //  마우스로 drag 방지
    area.onselectstart = function(){
        return false;
    }

    area.addEventListener('dblclick', function(){
        let div = document.createElement('div')
        div.innerHTML = '더블클릭 발생'
        log.prepend(div)
    })

    area.addEventListener('mousedown', function(){
        let div = document.createElement('div')
        div.innerHTML = 'mousedown 발생'
        log.prepend(div)
    })
      area.addEventListener('click', function(evt){
        // let div = document.createElement('div')
        // div.innerHTML = 'mouseup 발생'
        // log.prepend(div)

        console.log('offsetY', evt.offsetY)
        console.log('pageY', evt.pageY)

        console.log('clientY', evt.clientY)
        console.log('screenY', evt.screenY)
        showLog('click 발생')
    })
    //  area.addEventListener('mouseover', function(){ 
    area.addEventListener('mouseover', function(){
        showLog('mouseover 발생') 
        area.style.backgroundColor = 'yellow'
    })
     //  area.addEventListener('mouseleave', function(){ 
     area.addEventListener('mouseout', function(){
        showLog('mouseout 발생') 
        area.style.backgroundColor = 'withe'
    })
     area.addEventListener('mousemove', function(evt){
        const offsetX = evt.offsetX 
        const offsetY = evt.offsetY
        showLog(`offsetX : ${offsetX}, offsetY : ${offsetX}`)
    })

     // document.querySelector('body')
     //   .addEventListener('mousemove', function(evt){
     //       const cursor = document.querySelector('#cursor')

     //       cursor.style.left = evt.pageX + "px"
     //       cursor.style.top = evt.pageY + "px"

     //       cursor.style.position = "absolute"

     // })
     document.querySelector('body')
        .addEventListener('mousemove', function(evt){
            // 마우스 따라다니는 코드
            // 단, 마우스를 눌렀을 때 만
            if(isDrag){
                let drag = document.querySelector('#drag')
                drag.style.top = (evt.pageY - drag_offset_y) +'px'
                drag.style.left = (evt.pageX - drag_offset_x) +'px'
            }
    })
    document.querySelector('#drag')
        .addEventListener('mousedown', function (evt) {
             isDrag = true
             drag_offset_x = evt.offsetX
             drag_offset_y = evt.offsetY
    })
    document.querySelector('#drag')
        .addEventListener('mouseup', function () {
             isDrag = false
    })
}
let isDrag = false;
let drag_offset_x = 0;
let drag_offset_y = 0;

function showLog(msg) {
     let div = document.createElement('div')
     div.innerHTML = msg
     log.prepend(div)
}

