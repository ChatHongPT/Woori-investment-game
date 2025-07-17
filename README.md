## 💰 JAVA로 모의투JA 게임 💰

![Java Investment Game](https://img.shields.io/badge/Java_Investment_Game-🎮-FF6B6B?style=for-the-badge&logo=gamepad&logoColor=white)

![TalkMedia_i_f3ffb61fb128 png](https://github.com/user-attachments/assets/88685756-bb55-4afb-9de0-0904eea01216)

## 🎮 게임 소개

실제 주식 시장을 모방한 투자 시뮬레이션 게임으로, 가상의 자금으로 주식을 매수/매도하며 수익을 극대화하는 것이 목표입니다.

---

## 📊 ERD (Entity Relationship Diagram)

<img width="1070" height="562" alt="image" src="https://github.com/user-attachments/assets/2dac1cfa-41a5-4393-988d-4baa49bfe417" />

### 데이터베이스 설계

#### 📋 **Stock (주식) 테이블**
- `s_id` (BIGINT, PK) - 주식 고유 ID
- `s_price` (INT) - 현재 주가
- `s_graph` (DOUBLE) - 가격 변동률
- `s_name` (VARCHAR(50)) - 주식 이름

#### 👤 **User (사용자) 테이블**
- `u_name` (VARCHAR(20), PK) - 사용자 이름
- `u_wallet` (INT) - 보유 현금
- `u_password` (VARCHAR(20)) - 사용자 비밀번호

#### 📰 **News (뉴스) 테이블**
- `id` (INT, PK) - 뉴스 ID
- `n_isGood` (Boolean) - 호재/악재 여부
- `n_message` (String) - 뉴스 내용

#### 💼 **Portfolio (포트폴리오) 테이블**
- `p_id` (BIGINT, PK) - 포트폴리오 ID
- `p_amount` (INT) - 보유 수량
- `u_name` (VARCHAR(20), FK) - 사용자 이름
- `p_amount` (INT) - 매수 수량
- `s_name` (VARCHAR(20), FK) - 주식 이름
- `s_id` (BIGINT, FK) - 주식 ID

---

## 🏗️ 시스템 아키텍처

<img width="731" height="449" alt="스크린샷 2025-07-17 오후 4 05 10" src="https://github.com/user-attachments/assets/8ee51e6a-7c66-4a84-95fc-17c7e539e7e4" />

### 아키텍처 구성 요소

#### 🖥️ **클라이언트 계층**
- **Windows 환경**: 콘솔 기반 사용자 인터페이스
- **Java 개발 환경**: 개발자용 IDE 및 도구

#### ⚙️ **애플리케이션 계층**
- **VirtualBox**: 가상화 환경에서 실행
- **Docker**: 컨테이너 기반 MySQL 데이터베이스 배포
- **Java Runtime**: JDK 17+ 기반 실행 환경

#### 🗄️ **데이터 계층**
- **MySQL Database**: Docker 컨테이너로 배포
- **KRX 데이터**: 한국거래소 정보데이터시스템 연동
- **Data Pipeline**: KRX → 전처리 → MySQL 적재
- **300개 종목**: 실제 주식 시장 데이터 활용

#### 🎮 **게임 엔진**
- **CPU Features**: 멀티코어 처리 지원
- **Custom Game Engine**: 순수 Java로 구현된 게임 로직

#### 👥 **사용자 관리**
- **User**: 게임 사용자 관리
- **Developer**: 개발자 관리 시스템

---

## 🛠️ 기술 스택

### 💻 **언어 & 런타임**
![Java](https://img.shields.io/badge/Java-ED8B00?style=plastic&logo=openjdk&logoColor=white)
![JDK](https://img.shields.io/badge/JDK-17+-007396?style=plastic&logo=java&logoColor=white)

### 🏗️ **아키텍처 & 디자인 패턴**
![MVC Pattern](https://img.shields.io/badge/MVC_Pattern-FF6B6B?style=plastic&logo=architecture&logoColor=white)
![Singleton Pattern](https://img.shields.io/badge/Singleton_Pattern-9C27B0?style=plastic&logo=pattern&logoColor=white)

### 🖥️ **사용자 인터페이스**
![Console](https://img.shields.io/badge/Console_Interface-000000?style=plastic&logo=windows-terminal&logoColor=white)
![CLI](https://img.shields.io/badge/Command_Line-1E88E5?style=plastic&logo=gnu-bash&logoColor=white)

### 📚 **라이브러리 & 도구**
![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=plastic&logo=lombok&logoColor=white)

### 🎯 **게임 엔진 & 로직**
![Game Engine](https://img.shields.io/badge/Custom_Game_Engine-FF9800?style=plastic&logo=unity&logoColor=white)
![Simulation](https://img.shields.io/badge/Investment_Simulator-00D26A?style=plastic&logo=stockx&logoColor=white)
![Random Generator](https://img.shields.io/badge/Random_Generator-E91E63?style=plastic&logo=random&logoColor=white)

### 💾 **데이터베이스 & 인프라**
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=plastic&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=plastic&logo=docker&logoColor=white)
![VM](https://img.shields.io/badge/Virtual_Machine-183A61?sstyle=plastic&logo=virtualbox&logoColor=white)
![KRX Data](https://img.shields.io/badge/KRX_Data-FF6B35?style=plastic&logo=chart-line&logoColor=white)

### 🔧 **개발 도구 & 배포**
![Git](https://img.shields.io/badge/Git-F05032?style=plastic&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=plastic&logo=github&logoColor=white)

---

## 🎮 게임 특징

### 📈 **주식 시장 데이터**
- **300개 주요 종목** 실시간 거래 (KRX 데이터 기반)
- **실제 주식 데이터** 활용 (한국거래소 정보데이터시스템)
- **데이터 전처리** 및 정규화
- **랜덤 가격 변동** 시스템 (실제 데이터 기반)
- **상승/하락/보합** 상태 표시

### 💰 **투자 시스템**
- **주식 매수/매도** 기능
- **평균 매수가** 자동 계산
- **실시간 손익** 계산 및 표시
- **수익률** 분석

### 📱 **포트폴리오 관리**
- **보유 종목** 현황 관리
- **투자 성과** 분석
- **총 자산** 추적
- **개별 종목별** 손익 현황

### 📰 **뉴스 시스템**
- **랜덤 뉴스** 생성 (확률 기반)
- **호재/악재**에 따른 주가 영향
- **뉴스 히스토리** 관리
- **실시간 시장 반응** 시뮬레이션

---

## 📁 프로젝트 구조

```
Woori-investment-game/
 ┣ src/
 ┃ ┣ controller/
 ┃ ┃ ┣ MarketManager.java
 ┃ ┃ ┣ NewsGenerator.java
 ┃ ┃ ┣ StockManager.java
 ┃ ┃ ┗ UserController.java
 ┃ ┣ model/
 ┃ ┃ ┣ domain/
 ┃ ┃ ┃ ┣ News.java
 ┃ ┃ ┃ ┣ PortFolio.java
 ┃ ┃ ┃ ┣ Stock.java
 ┃ ┃ ┃ ┗ User.java
 ┃ ┃ ┣ dto/
 ┃ ┃ ┃ ┗ NewsStockPair.java
 ┃ ┃ ┣ NewsDAO.java
 ┃ ┃ ┣ PortfolioDAO.java
 ┃ ┃ ┣ StockDAO.java
 ┃ ┃ ┗ UserDAO.java
 ┃ ┣ Run/
 ┃ ┃ ┗ Main.java
 ┃ ┣ util/
 ┃ ┃ ┗ DBUtil.java
 ┃ ┗ view/
 ┃   ┗ ConsoleUI.java
 ┣ Dockerfile
 ┣ pom.xml
 ┗ README.md
```

---

## ⚙️ 설치 및 실행

### 📋 사전 요구사항
![JDK Required](https://img.shields.io/badge/Required-JDK_17+-007396?style=flat-square&logo=java&logoColor=white)
![Docker Required](https://img.shields.io/badge/Required-Docker-2496ED?style=flat-square&logo=docker&logoColor=white)
![MySQL Required](https://img.shields.io/badge/Required-MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)

### 🐳 Docker 환경 설정

1. **MySQL 컨테이너 실행**
   ```bash
   docker run --name investment-mysql \
     -e MYSQL_ROOT_PASSWORD=password \
     -e MYSQL_DATABASE=investment_game \
     -p 3306:3306 \
     -d mysql:8.0
   ```

2. **KRX 데이터 적재**
   ```bash
   # KRX 데이터 전처리 후 MySQL 적재
   mysql -h localhost -u root -p investment_game < krx_data.sql
   ```

### 🔧 실행 방법

1. **저장소 클론**
   ```bash
   git clone https://github.com/FISA-STUDY/Woori-investment-game.git
   cd Woori-investment-game
   ```

2. **데이터베이스 연결 설정**
   ```java
   // application.properties
   db.url=jdbc:mysql://localhost:3306/investment_game
   db.username=root
   db.password=password
   ```

3. **컴파일 및 실행**
   ```bash
   javac -d bin src/**/*.java
   java -cp bin Run.Main
   ```

---

## 🎯 게임 플레이 가이드

### 🏁 게임 시작
1. **사용자 이름** 입력
2. **초기 자금** 자동 설정 (1,000,000원)
3. 게임 시작!

### 📋 메인 메뉴
- `1` 📊 **주식 시장 보기** - 현재 주가 및 변동 현황
- `2` 💳 **주식 매매** - 매수/매도 메뉴
- `3` 📈 **포트폴리오 보기** - 투자 현황 및 수익률
- `4` 📅 **다음날로 넘어가기** - 시간 진행 및 뉴스 생성
- `0` 🚪 **게임 종료**

### 💡 게임 팁
- 📰 **뉴스를 주의깊게** 확인하세요
- 📈 **분산 투자**로 리스크를 줄이세요
- 📊 **포트폴리오**를 정기적으로 점검하세요
- ⏰ **타이밍**이 중요합니다

---

## 🎨 게임 실행

![invest](https://github.com/user-attachments/assets/f28bb259-e961-4957-a8d0-f3360f8944ef)


---

```bash
╔════════════════════════════════════════╗
║          💰 미니투자게임 💰            ║
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

```

---

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

---
