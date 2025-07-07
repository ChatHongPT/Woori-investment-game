## 💰 JAVA로 모의투JA 게임

![Java](https://img.shields.io/badge/Java-ED8B00?style=plastic&logo=openjdk&logoColor=white)
![Console Game](https://img.shields.io/badge/Console_Game-000000?style=plastic&logo=windows-terminal&logoColor=white)
![Investment Simulator](https://img.shields.io/badge/Investment_Simulator-00D26A?style=plastic&logo=stockx&logoColor=white)
![MVC Pattern](https://img.shields.io/badge/MVC_Pattern-FF6B6B?style=plastic&logo=java&logoColor=white)

![TalkMedia_i_f3ffb61fb128 png](https://github.com/user-attachments/assets/88685756-bb55-4afb-9de0-0904eea01216)

순수 자바로 구현한 콘솔 기반 주식 투자 시뮬레이션 게임입니다.

## 🎮 게임 소개

실제 주식 시장을 모방한 투자 시뮬레이션 게임으로, 가상의 자금으로 주식을 매수/매도하며 수익을 극대화하는 것이 목표입니다.

## 📊 ERD

![모의투자게임 (2)](https://github.com/user-attachments/assets/f8865194-3242-4cee-ab1e-a519bf7351fb)

## 🚀 주요 기능

### 📈 주식 시장 시뮬레이션
- **5개 주요 종목** 실시간 거래
  - 삼성전자, SK하이닉스, NAVER, 카카오, LG에너지솔루션
- **랜덤 가격 변동** 시스템
- **상승/하락/보합** 상태 표시

### 💰 투자 시스템
- **주식 매수/매도** 기능
- **평균 매수가** 자동 계산
- **실시간 손익** 계산 및 표시
- **수익률** 분석

### 📱 포트폴리오 관리
- **보유 종목** 현황 관리
- **투자 성과** 분석
- **총 자산** 추적
- **개별 종목별** 손익 현황

### 📰 뉴스 시스템
- **랜덤 뉴스** 생성 (확률 기반)
- **호재/악재**에 따른 주가 영향
- **뉴스 히스토리** 관리
- **실시간 시장 반응** 시뮬레이션

## 🛠️ 기술 스택

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=plastic&logo=openjdk&logoColor=white)
![Console](https://img.shields.io/badge/Interface-Console-000000?style=plastic&logo=windows-terminal&logoColor=white)
![MVC](https://img.shields.io/badge/Architecture-MVC-4CAF50?style=plastic&logo=object&logoColor=white)

- **언어**: Pure Java (JDK 17+)
- **인터페이스**: Console 기반
- **아키텍처**: MVC 패턴
- **외부 라이브러리**: Lombok

## 📁 프로젝트 구조

```
📦 Mini-Project
 ┣ 📂 src/
 ┃ ┣ 📂 controller/
 ┃ ┃ ┣ 📜 GameEngine.java
 ┃ ┃ ┣ 📜 MarketManager.java
 ┃ ┃ ┣ 📜 NewsGenerator.java
 ┃ ┃ ┗ 📜 TradeManager.java
 ┃ ┃
 ┃ ┣ 📂 model/
 ┃ ┃ ┣ 📂 domain/
 ┃ ┃ ┃ ┣ 📜 News.java
 ┃ ┃ ┃ ┣ 📜 Portfolio.java
 ┃ ┃ ┃ ┣ 📜 Stock.java
 ┃ ┃ ┃ ┗ 📜 User.java
 ┃ ┃ ┣ 📜 database.java
 ┃ ┃ ┗ 📜 model.java
 ┃ ┃
 ┃ ┣ 📂 view/
 ┃ ┃ ┗ 📜 consoleUI.java
 ┃ ┃ 
 ┃ ┗ 📂 Run/
 ┃   ┗ 📜 Main.java
 ┗ 📜 README.md
```

## ⚙️ 설치 및 실행

### 📋 사전 요구사항
![JDK](https://img.shields.io/badge/JDK-17+-007396?style=plastic&logo=java&logoColor=white)

- Java JDK 17 이상

### 🔧 실행 방법

1. **저장소 클론**
   ```bash
   git clone https://github.com/FISA-STUDY/Woori-investment-game.git
   cd Woori-investment-game
   ```

2. **컴파일**
   ```bash
   javac -d bin src/**/*.java
   ```

3. **실행**
   ```bash
   java -cp bin Run.Main
   ```

## 🎯 게임 플레이 가이드

### 🏁 게임 시작
1. **사용자 이름** 입력
2. **초기 자금** 자동 설정 (1,000,000원)
3. 게임 시작!

### 📋 메인 메뉴
- `1` 📊 **주식 시장 보기** - 현재 주가 및 변동 현황
- `2` 💳 **주식 매매** - 매수/매도 메뉴
  - `1` 💳 **주식 매수** - 원하는 종목 매수
  - `2` 📈 **주식 매도** - 보유 종목 매도
- `3` 📈 **포트폴리오 보기** - 투자 현황 및 수익률
- `4` 📅 **다음날로 넘어가기** - 시간 진행 및 뉴스 생성
- `0` 🚪 **게임 종료**

### 💡 게임 팁
- 📰 **뉴스를 주의깊게** 확인하세요 - 주가에 직접적인 영향을 줍니다
- 📈 **분산 투자**로 리스크를 줄이세요
- 📊 **포트폴리오**를 정기적으로 점검하세요
- ⏰ **타이밍**이 중요합니다

### 🎮 게임 사용법
- **매수/매도**: "삼성전자 10" 형식으로 입력
- **거래 확인**: y/n으로 거래 확인
- **취소**: 언제든지 '0'을 입력하여 이전 메뉴로 돌아가기

## 🗂️ 주요 클래스 구조

### 🎮 Controller Layer
- **GameEngine**: 게임 전체 진행 및 상태 관리
- **MarketManager**: 주식 시장 데이터 관리
- **NewsGenerator**: 뉴스 생성 및 주가 변동 적용
- **TradeManager**: 주식 매매 로직 관리

### 🖥️ Run Layer
- **Main**: 게임 시작점 및 초기화

## 🎨 게임 스크린샷

```
╔════════════════════════════════════════╗
              💰 미니투자게임 💰               
╚════════════════════════════════════════╝

============================================================
📅 1일차 | 👤 투자왕 | 💰 1,000,000원
============================================================

📋 메인 메뉴

1. 📊 주식 시장 보기
2. 💳 주식 매매
3. 📈 포트폴리오 보기
4. 📅 다음날로 넘어가기
0. 🚪 게임 종료

➤ 메뉴를 선택하세요 (0-4): 
```

## 🔧 주요 기능 상세

### 📊 주식 시장
- 주식 가격 표시
- 가격 변동률 시각화
- 각 종목별 거래 가능 수량 표시

### 💰 매매 시스템
- 직관적인 매수/매도 인터페이스
- 거래 전 확인 시스템
- 잔고 부족 및 보유량 부족 검증
- 거래 완료 후 자산 업데이트

### 📈 포트폴리오
- 보유 주식 현황 표시
- 평균 매수가 계산
- 현재 가치 실시간 업데이트
- 총 자산 계산

### 📰 뉴스 시스템
- 매일 랜덤 뉴스 생성
- 호재/악재에 따른 주가 변동
- 뉴스 내용 표시

## 🔍 프로젝트 회고 및 개선사항

### 📋 발견된 문제점들

#### 1. 클래스 구조 관련
- ❌ **생성자 위치**: 변수 선언 아래에 생성자 배치
- ❌ **네이밍 컨벤션**: `u_name`, `s_price` 등 언더스코어 사용
- ✅ **개선**: 생성자를 클래스 최상단에, camelCase 네이밍 사용

#### 2. 모델 객체 설계
- ❌ **싱글톤 패턴**: 모든 사용자가 하나의 Model 객체 공유
- ❌ **currentPlayer**: 멀티유저 환경에서 문제 발생 가능
- ✅ **개선**: 각 게임 세션별 독립적인 객체 관리

#### 3. 객체 생성 및 초기화
- ❌ **메서드 내 생성**: `createPlayer()` 메서드 내부에서 객체 생성
- ✅ **개선**: 클래스 레벨에서 고정된 유저 객체 생성

#### 4. 코드 스타일
- ❌ **괄호 들여쓰기**: 일관성 없는 코드 포맷팅
- ❌ **불필요한 import**: 사용하지 않는 import 문들
- ✅ **개선**: 일관된 스타일 가이드 적용

#### 5. 입력 처리 및 예외 처리
- ❌ **직접 파싱**: `Integer.parseInt()` 예외 처리 부족
- ✅ **개선**: Scanner + 예외처리로 안전한 입력 검증

#### 6. 불변 객체 설계
- ❌ **가변 필드**: 변경되지 않는 값도 가변으로 선언
- ✅ **개선**: `final` 키워드로 불변 필드 설계
  

### 💡 학습된 교훈

1. **객체지향 설계 원칙**
   - 단일 책임 원칙 준수
   - 불변 객체로 안전성 확보
   - 의존성 주입 방식 사용

2. **코드 품질 향상**
   - 일관된 네이밍 컨벤션
   - 명확한 예외 처리 메시지
   - 철저한 입력 검증

3. **유지보수성 개선**
   - 상수 분리로 매직 넘버 제거
   - 메서드 단일 책임 원칙
   - 관심사별 클래스 분리
