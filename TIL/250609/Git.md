# Git 사용법

TIL_250609


[git 사용을 위한 기본 명령어]

mkdir : 폴더 만들기
cd : 경로 이동
ls : 무슨 파일이 있는지 확인하는 것
cat : 'cat a.txt' 가 있다면 그 안에 내용을 읽을 수 있음
open . : 해당 경로의 폴더 위치를 열 수 있음
echo "aaa" >> a.txt : a.txt 파일 생성과 동시에 내용 삽입 가능

git init : git 저장소 생성 및 기존 저장소 초기화
git add : git의 추가, git add . 이면 대부분 모든 파일 추가
git commit -m "..." : git commit 메시지
git remote add origin [git URL] : 원격 remote 레포지토리에 추가
git push -u origin main : 처음 push 할 경우
git push : 이후에는 그냥 push 하면 된다
git clone [URL] : 로컬에 해당 주소 레포지토리를 클론
git log :  그 동안 commit한 것들을 확인 가능
git reset --hard [log로 부터 뜨는 commit 주소] : 해당 위치까지 삭제
git push : remote repository랑 맞추기
git status : 깃 상태 확인
git remote -v : 로컬과 원격 레포지토리 확인


[git branch]

분기점
하나의 프로젝트를 fork 하여 여러 사람이 프로젝트로 가져가서 작업하고 각자 master에 pull request를 요청하면 
메인 작업자가 해당 내용을 확인하고 comment 등을 달면서 나중에 문제가 없을 경우에 merge를 해준다.

