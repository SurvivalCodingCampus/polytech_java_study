

# Git이란?

### 단순 명령어

- mkdir path : 폴더 생성
- echo “Hello” > sample.txt
    
    → sample.txt 생성
    
- ls : 모든 파일 보기
- cat sample.txt : sample.txt의 내용 확인
- ~/ : 홈 경로

### git gui

- 시니어 : fork
- 주니어 : kraken

### Git 명령어

- 이전 commit으로 돌아가기
    - git reset --hard 커밋로그
    - git pull을 하면 다시 최신상태로 돌아감 or 다시 커밋로그를 사용하여 최신 상태로 돌아감.
    

### 깃 컨벤션

- feat: 새로운 기능 추가
- fix: 버그 수정
- docs: 문서 수정 (예: [README.md](http://readme.md/))
- style: 코드 포맷팅, 세미콜론 누락, 코드 변경이 없는 경우
- refactor: 코드 리팩토링
- test: 테스트 코드 추가 또는 수정
- chore: 빌드 업무 수정, 패키지 매니저 수정
- design: CSS 등 사용자 UI 디자인 변경
- comment: 필요한 주석 추가 및 변경
- rename: 파일 혹은 폴더명을 수정하거나 옮기는 작업
- remove: 파일을 삭제하는 작업만 수행한 경우
- !BREAKING CHANGE: 커다란 API 변경의 경우
- !HOTFIX: 급하게 치명적인 버그를 고쳐야 하는 경우

### PR(오픈소스 기여 방식)

- Fork한 후 clone함
- 파일 수정 후 add, commit , push하기
- Fork한 레포(내꺼)에서 PR생성하기
- 왼쪽에서 branch 설정함

- 룰대로 작성하기
- Review가 남겨진대로 수정하기
- 잘못했다면
    - Edit할 수 있음
    - 아래 close하기(비추천)

