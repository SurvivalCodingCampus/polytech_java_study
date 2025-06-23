package com.survivalcoding;

public class Wizard {

    private int hp;
    private int mp = 100; // 문제 04) 초기값 100으로 설정
    private String name;
    private Wand wand;


    public Wizard(String name, int hp, int mp, Wand wand) { // 생성자
        setName(name);  // 검증 로직 실행
        setHp(hp);      // 검증 로직 실행
        setMp(mp);
        this.wand = wand;
        // 검증 로직 실행
//        this.name = name; // 직접 할당
//        this.hp = hp;
//        this.mp = mp;

        //this.wand = getWand(); // wand가 null 이면 null 반환하게 됨
        //wand는 나중에 setWand()로 설정
    }

    // HP 관련 get, set
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

    // MP 관련 get, set
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            throw new IllegalArgumentException("mp는 음수가 될 수 없다.");
        }
        this.mp = mp;
    }

    // NAME 관련 get, set
    public String getName() {
        return name; // 외부에서 Hero.name 메소드를 알 수 있게 해줌
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }
        this.name = name; // 새로운 값을 변경 가능하게 해줌
    }

    // WAND 관련 get, set
    public Wand getWand() {
        return wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("마법사의 지팡이는 null이 될 수 없다.");
        }

        this.wand = wand;
    }

    public void heal(Hero hero) {
        //1. 지팡이 파워로 힐을 실행
        int basePoint = 10; // 기본 회복 포인트
        int recoverPoint = (int) (basePoint * this.wand.getPower()); // 지팡이에 의한 증폭
        //private인 power의 값을 읽기 위해 설정 되어 있는 getPower()로 접근

        //2. 그 다음 MP 체크
        hero.setHp(hero.getHp() + recoverPoint); // 용사의 HP를 회복

        if (this.mp < 10) { // 힐 스킬 사용 mp = 10 이기에 10 이하면 사용x
            System.out.println("마나가 부족합니다");
            return;
        }

        // 3. 다시 힐 실행
        //힐 : Hero의 hp를 20 회복, 자신의 mp를 10 소모
        hero.setHp(hero.getHp() + 20);
        this.setMp(this.getMp() - 10);

        //힐 성공 메세지 출력
        System.out.println("힐을 시전했습니다. 대상 HP : " + hero.getHp());

    }


}
