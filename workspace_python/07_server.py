from flask import Flask, request, render_template

# flask 초기화
app = Flask(__name__)

@app.route("/home")
def home() :
    a = 10
    print(a)
    return '<h1>hello web</h1>'

@app.route("/login", methods=['GET','POST'])
def login() :
    # 넘겨받은 파라메터 출력
    print(request.method)
    if request.method == 'GET' :
        # GET 방식
        id = request.args.get("id")
        print("id : ", id)
    elif request.method == 'POST' :
        # POST 방식
        id = request.form.get("id")
        print("id : ", id)
    else :
        print('다른 메소드')

    return f'너의 아이디는 your id is {id} 입니다'

@app.route("/join")
def join() :
    return render_template("main.html", id2=id)


# 서버구동
# flask 기본모드 : 5000
app.run(port=5000, debug =True)