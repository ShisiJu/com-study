let div = document.querySelector("#div");


class MyJquery {
    constructor(dom) {
        var ele = {};
        if (dom instanceof HTMLDivElement) {
            ele = dom;
        } else if (typeof dom === "string") {
            ele = document.querySelector(dom);
        }
        this.ele = ele;
        this.events = {};
    }

    toString() {
        return '(' + this.ele + ')';
    }

    on(type, data, callback) {
        // 没有传data,只有两个参数
        if (typeof data === "function") {
            callback = data;
            data = {};

        }

        if (typeof type === "string") {
            if (!this.events [type]) {
                this.events [type] = [];
            }
            // 元素上可能存在多个同名事件
            this.events [type].push(new CustomEvent(type, {detail: data}));
        }

        this.ele.addEventListener(type, callback);
    }

    fire(type) {
        if (!this.events [type]) {
            this.events [type] = [];
        }

        if (this.events[type].length === 0) {
            return;
        }

        this.events[type].forEach(event => {
            this.ele.dispatchEvent(event);
        })

    }
}


function print(str) {
    console.log(str)

}


let $div = new MyJquery("#div");

print($div);


$div.on("build", {}, function (e) {
    print(" build ---- on");
});


$div.fire("build");

















