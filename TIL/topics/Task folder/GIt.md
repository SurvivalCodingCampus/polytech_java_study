```bash
pwd
- 현재 폴더를 확인
```

```bash
mkdir -p dev/git_test
- dev폴더 안에 git_test 폴더를 만듬
```

```bash
cd dev/git_test
- dev → git_test 폴더로 이동
```

```bash
git init
- 현재 폴더를 초기화하여, 들어가 있는 폴더 안에 .git 폴더를 생성 (DB 저장)
- git config —list
- 현재 설정 값 리스트 출력
```

```bash
echo “Hello git”
- printf (””); 와 같은 개념
- echo “Hello git” > sample.txt : Hello git 이라는 내용을 텍스트 파일에 새로 생성
- echo “Hello git” >> sample.txt : 파일에 텍스트를 추가하겠다는 의미
```

```bash
ls
- 현재 목록에 있는 폴더를 보는 명령어
```

```bash
cat sample.txt현재
- 파일 안에 있는 텍스트를 출력
```

```bash
git status
- 현재까지 작업한 파일의 리스트를 출력
```

```bash
git add sample.txt
- sample.txt 파일을 새로운 파일로 만들어줌
```

```bash
git commit -m “xx기능을 추가”
- 하나의 저장 기록을 남기는 작업
```

```bash
git branch -m master
- 브런치의 이름을 master로 바꾼다
```

```bash
git remote add origin 깃 주소
- 본인의 깃 주소로 연결을 한다는 것
- origin은 변수의 이름으로 바꿔도 됨, 근데 암묵적으로 origin을 사용
```

```bash
git push -u origin main
- GitHub의 main 브랜치에 첫 커밋을 업로드
```

```bash
git add .
- 현재 폴더의 모든 변경사항(stage)에 추가
```

```bash
git clone 본인 깃허브 ssh
- 깃허브에서 파일을 가져오는 방법
```

```bash
git reset —hard : 현재 작성중인 모든것을 날림
- 반드시 push를 한 후, 리셋을 해야함
- commit code번호를 앞부분을 작성
```