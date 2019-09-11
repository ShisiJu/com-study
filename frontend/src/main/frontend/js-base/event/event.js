let div = document.querySelector("#div");

let eventMap = {};

let on = function (dom, type, callback) {
    eventMap[type] = new Event(type);
    dom.addEventListener(type, callback, false);

};

let fire = function (dom, type) {
    dom.dispatchEvent(eventMap[type]);
};


on(div, "build", function (e) {
    console.log(e);
    console.log("build ---- fire --- ");
});


div.addEventListener("click", function (evt) {
    console.log(" click ");
    fire(div, "build");
});











