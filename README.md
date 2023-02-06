# 룸대여 서비스

팀원: 박세윤

1. **프로젝트 개요**

이 프로젝트는 룸대여 서비스의 이용 진행 과정을 구현했다. 방의 테마(영화, 노래, 게임, 만화)에 따라 다양한 형태의 룸대여 서비스를 경험할 수 있고 선택한 테마에 적합한 옵션들을 추가할 수 있게 구현했다.

1. **프로젝트 설계**
2. Theme abstract class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| options | List<Option> | 테마의 기본 옵션들 |
| createOption | Method | 옵션 생성 |
| optionGet | Method | 옵션 불러오기 |
| createOption | Method | 옵션 추가 |

2) Game class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| orderNormal | Method | 기본 주문 |
| orderSpecial | Method | 추가 주문 |
| doPay | Method | 결제 처리 |
| createOption | Method | 추가한 옵션들 생성 |

3) DVD class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| orderNormal | Method | 기본 주문 |
| orderSpecial | Method | 추가 주문 |
| doPay | Method | 결제 처리 |
| createOption | Method | 추가한 옵션들 생성 |

4) Song class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| orderNormal | Method | 기본 주문 |
| orderSpecial | Method | 추가 주문 |
| doPay | Method | 결제 처리 |
| createOption | Method | 추가한 옵션들 생성 |

5) Cartoon clas

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| orderNormal | Method | 기본 주문 |
| orderSpecial | Method | 추가 주문 |
| doPay | Method | 결제 처리 |
| createOption | Method | 추가한 옵션들 생성 |

6) Option interface

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 옵션 변경하기 |

7) GameDevice class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 게임기 옵션 변경하기 |

8) Screen class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 스크린 옵션 변경하기 |

9) Speaker class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 스피커 옵션 변경하기 |

10) Mike class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 마이크 옵션 변경하기 |

11) Movie class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 영화 옵션 변경하기 |

12) Tablet class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| setChangeOption | Method | 변경할 옵션 넣기 |
| ChangeOption | Method | 태블릿 옵션 변경하기 |

13) ChangeOption interface

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 옵션 변경 |

14) Playstation class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 게임기를 playstaion으로 변경 |

15) XBOX class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 게임기를 XBOX으로 변경 |

16) Nintendo class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 게임기를 Nintendo로 변경 |

17) Drama class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 영화를 Drama로 변경 |

18) Animation class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 영화를 Animation로 변경 |

19) PcMonitor class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스크린을 PcMonitor로 변경 |

20) Vimprojector class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스크린을 Vimprojector로 변경 |

21) Tv

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스크린을 Tv로 변경 |

22) StereophonicSound class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스피커를 StereophonicSound로 변경 |

23)　StereoSound class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스피커를 StereoSound로 변경 |

24) MonoSound class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 스피커를 monoSound로 변경 |

25) DynamicMike class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 마이크를 DynamicMike로 변경 |

26) RibbonMike class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 마이크를 RibbonMike로 변경 |

27) Ipad class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 마이크를 Ipad로 변경 |

28) GalaxyTap class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| change | Method | 마이크를 GalaxyTap으로 변경 |

30) ThemeStrategy interface

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| normalOrder | Method | 기본 주문 |
| specialOrder | Method | 추가 주문 |
| doPay | Method | 결제 처리 |

31) SelectTheme class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| themeStrategy | ThemeStrategy | 테마를 받을 변수 |
| setThemeStrategy | Method | 선택한 테마를 넣어주는 함수 |
| selectNormal | Method | 기본 주문 선택 |
| selectSpecial | Method | 추가 주문 선택 |
| selectPayment | Method | 결제 처리 선택 |

32) ThemeTemplate abstract class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| selectNormal | Method | 기본 주문 선택 |
| selectSpecial | Method | 추가 주문 선택 |
| selectPayment | Method | 결제 처리 선택 |
| selectTemplate | Method | 템플릿 선택 |

33) RoomDecorator abstract class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| roomDecorator | RoomDecorator | 방 추가 옵션 |
| RoomDecorator | Constructor | 방을 꾸며주는 생성자 |
| RoomDecorator | Constructor | 또 다른 방옵션을 가져오는 생성자 |
| addOption | Method | 옵션 추가 |

34) ShowerRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| ShowerRoom | Constructor | 수면방 생성자 |
| ShowerRoom | Constructor | 기존방에 옵션을 더 생성하는 생성자 |
| addOption | Method | 옵션 추가 |
| addShowerRoom | Method | 샤워룸 추가 |

35) BedRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| BedRoom | Constructor | 수면방 생성자 |
| BedRoom | Constructor | 기존방에 옵션을 더 생성하는 생성자 |
| addOption | Method | 옵션 추가 |
| addBedRoom | Method | 수면방 추가 |

36) RoomTime class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| RoomTime | Constructor | 대여시간 설정 생성자 |
| RoomTime | Constructor | 기존방에 옵션을 더 생성하는 생성자 |
| addOption | Method | 옵션 추가 |
| addRoom | Method | 대여시간 추가 |

37) RoomSize class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| size | Size | 사이즈에 따른 방을 받는 변수 |
| RoomSize | Constructor | 사이즈 설정 생성자 |
| RoomSize | Constructor | 기존방에 옵션을 더 생성하는 생성자 |
| RoomSize | Constructor | 사이즈에 따른 방을 생성하는 생성자 |
| addRoom | Method | 옵션 추가 |
| addRoomSize | Method | 사이즈에 맞는 방 추가 |

38) Size interface

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| changeSize | Method | 사이즈 변경 |

39) SmallRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| changeSize | Method | 스몰 사이즈로 변경 |

40) DefaultRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| changeSize | Method | 기본 사이즈로 변경 |

41) BigRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| changeSize | Method | 빅 사이즈로 변경 |

42) SpecialBigSizeRoom class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| changeSize | Method | 초대형 사이즈로 변경 |

43) AddOrder class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| AddOrder | Method | 추가 주문 |
| orderFood | constructor | 음식 추가 주문 |
| orderTime | constructor | 시간 연장 주문 |
| orderItem | constructor | 물품 추가 주문 |
| build | Method | 다양한 품목들 추가 주문으로 묶기 |

44) Payment class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| payment
Command | constructor | 결제 방식 선택 |

45) QR class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| payQr | Method | QR 결제 |

46) PayQR class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| qr | constructor | qr 결제 객체 |

47) Card class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| payCard | Method | 신용카드 결제 |

48) PayCard class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| card | constructor | card 결제 객체 |

49) Money class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| payMoney | Method | 현금 결제 |

50) PayMoney class

| 속성명 | 타입 | 설명 |
| --- | --- | --- |
| money | constructor | 현금 결제 객체 |
1. **프로젝트 코드 및 설명**
- FactoryMethod 패턴을 사용하여 각 테마의 맞는 테마가 가진 기본 옵션들을 컴포지션 하여 테마를 만들었다.

Ex) 게임(게임기, 스크린, 스피커) -> 생성

- Strategy 패턴을 사용하여 테마에 따라 방을 이용하는 옵션이 다르게 하였고
- 테마가 다르더라도 방을 이용하는 순서는 같기 때문에 방을 이용하는 절차를 묶은 전략 패 턴을 Template method 패턴을 사용하여 실행순서를 묶어주었다.
- Decorator 패턴을 사용하여 방옵션을 동적으로 추가할수 있게 하였습니다.
- builder 패턴을 사용하여 추가 주문을 동일한 생성 절차에서 다른 주문 결과로 만들 수 있게 하였다.
- command 패턴을 사용하여 결제 요청을 캡슐화 하였고 결제를 요청하는 클래스와 결제를 수행하는 클래스를 분리했다.

**4. 테스트 코드 결과**
