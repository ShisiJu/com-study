let obj1 = {};

let myname = document.querySelector("#myname");
let mysex = document.querySelector("#mysex");

// 访问器属性
Object.defineProperty(obj1, 'input', {
    // get,set 不能与 value 和 writable 不能同时出现
    get: function () {
        return myname.value;
    },
    set: function (val) {
        myname.value = val;
    }
});

// 数据属性
let obj2 = {};
Object.defineProperty(obj2, 'bbbb', {
    value: 123,
    // 下面是默认值
    writable: false,
    enumerable: false,
    configurable: false
});

mysex.addEventListener("change", function () {
    console.log(obj2.bbbb);
});




