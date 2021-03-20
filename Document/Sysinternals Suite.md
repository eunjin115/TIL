# Sysinternals Suite

# Sysinternals Suite

## 1. Sysinternals Suite란

[https://docs.microsoft.com/en-us/sysinternals/downloads/sysinternals-suite](https://docs.microsoft.com/en-us/sysinternals/downloads/sysinternals-suite)

- Windows가 기본적으로 제공하는 도구로는 관리할 수 없는 다양한 시스템 정보 등을 취급할 수 있는 도구
- Window docs 소개 : The Sysinternals Troubleshooting Utilities have been rolled up into a single Suite of tools. This file contains the individual troubleshooting tools and help files. It does not contain non-troubleshooting tools like the BSOD Screen Saver.
- 즉 시스템 내부 문제 해결 유틸리티가 단일적으로 구성되어있는 프로그램. 개별 문제 해결 도구와 도움말 파일을 가지고 있으며, BSOD (블루스크린) 화면보호기 같은 문제는 해결 도구가 없다.
- The Sysinternals web site was created in 1996 by Mark Russinovich to host his advanced system utilities and technical information. Whether you’re an IT Pro or a developer, you’ll find Sysinternals utilities to help you manage, troubleshoot and diagnose your Windows systems and applications.
- Windows 시스템 및 어플리케이션을 관리하고 문제 해결, 진단하는데 도움이 되는 유틸리티 제공.

- [Sysinternals Suite](https://download.sysinternals.com/files/SysinternalsSuite.zip) - The entire set of Sysinternals Utilities rolled up into a single download.
- [Sysinternals Suite for Nano Server](https://download.sysinternals.com/files/SysinternalsSuite-Nano.zip) - Sysinternals Utilities for Nano Server in a single download. (나노 서버 - 데이터 센터 운영체제, 윈도 서버 2016)
- [Sysinternals Suite for ARM64](https://download.sysinternals.com/files/SysinternalsSuite-ARM64.zip) - Sysinternals Utilities for ARM64 in a single download. (ARM 64 - 아키텍쳐가 다른 CPU로 모바일 디바이스를 위한 아키텍쳐.)

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/_2021-03-09__11.06.58.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/_2021-03-09__11.06.58.png)

- README.txt에 있던 각 프로그램 설명
    - AccessChk - AccessChk is a command-line tool for viewing the effective permissions on files, registry keys, services, processes, kernel objects, and more.
    - AccessEnum - This simple yet powerful security tool shows you who has what access to directories, files and Registry keys on your systems. Use it to find holes in your permissions.
    - AdExplorer - Active Directory Explorer is an advanced Active Directory (AD) viewer and editor.
    - AdInsight - An LDAP (Light-weight Directory Access Protocol) real-time monitoring tool aimed at troubleshooting Active Directory client applications.
    - AdRestore - Undelete Server 2003 Active Directory objects.
    - Autologon - Bypass password screen during logon.
    - Autoruns - See what programs are configured to startup automatically when your system boots and you login. Autoruns also shows you the full list of Registry and file locations where applications can configure auto-start settings.
    - BgInfo - This fully-configurable program automatically generates desktop backgrounds that include important information about the system including IP addresses, computer name, network adapters, and more.
    - CacheSet - CacheSet is a program that allows you to control the Cache Manager's working set size using functions provided by NT. It's compatible with all versions of NT.
    - ClockRes - View the resolution of the system clock, which is also the maximum timer resolution.
    - Contig - Wish you could quickly defragment your frequently used files? Use Contig to optimize individual files, or to create new files that are contiguous.
    - Coreinfo - Coreinfo is a new command-line utility that shows you the mapping between logical processors and the physical processor, NUMA node, and socket on which they reside, as well as the cache�s assigned to each logical processor.
    - Ctrl2cap - This is a kernel-mode driver that demonstrates keyboard input filtering just above the keyboard class driver in order to turn caps-locks into control keys. Filtering at this level allows conversion and hiding of keys before NT even "sees" them. Ctrl2cap also shows how to use NtDisplayString() to print messages to the initialization blue-screen.
    - DebugView - Another first from Sysinternals: This program intercepts calls made to DbgPrint by device drivers and OutputDebugString made by Win32 programs. It allows for viewing and recording of debug session output on your local machine or across the Internet without an active debugger.
    - Desktops - This new utility enables you to create up to four virtual desktops and to use a tray interface or hotkeys to preview what�s on each desktop and easily switch between them.
    - Disk2vhd - Disk2vhd simplifies the migration of physical systems into virtual machines (p2v).
    - DiskExt - Display volume disk-mappings.
    - Diskmon - This utility captures all hard disk activity or acts like a software disk activity light in your system tray.
    - DiskView - Graphical disk sector utility.
    - Disk Usage (DU) - View disk usage by directory.
    - EFSDump - View information for encrypted files.
    - Handle - This handy command-line utility will show you what files are open by which processes, and much more.
    - Hex2dec - Convert hex numbers to decimal and vice versa.
    - Junction - Create Win2K NTFS symbolic links.
    - LDMDump - Dump the contents of the Logical Disk Manager's on-disk database, which describes the partitioning of Windows 2000 Dynamic disks.
    - ListDLLs - List all the DLLs that are currently loaded, including where they are loaded and their version numbers. Version 2.0 prints the full path names of loaded modules.
    - LiveKd - Use Microsoft kernel debuggers to examine a live system.
    - LoadOrder - See the order in which devices are loaded on your WinNT/2K system.
    - LogonSessions - List the active logon sessions on a system.
    - MoveFile - Allows you to schedule move and delete commands for the next reboot.
    - NTFSInfo - Use NTFSInfo to see detailed information about NTFS volumes, including the size and location of the Master File Table (MFT) and MFT-zone, as well as the sizes of the NTFS meta-data files.
    - PageDefrag - Defragment your paging files and Registry hives.
    - PendMoves - Enumerate the list of file rename and delete commands that will be executed the next boot.
    - PipeList - Displays the named pipes on your system, including the number of maximum instances and active instances for each pipe.
    - PortMon- Monitor serial and parallel port activity with this advanced monitoring tool. It knows about all standard serial and parallel IOCTLs and even shows you a portion of the data being sent and received. Version 3.x has powerful new UI enhancements and advanced filtering capabilities.
    - ProcDump - This new command-line utility is aimed at capturing process dumps of otherwise difficult to isolate and reproduce CPU spikes. It also serves as a general process dump creation utility and can also monitor and generate process dumps when a process has a hung window or unhandled exception.
    - Process Explorer - Find out what files, registry keys and other objects processes have open, which DLLs they have loaded, and more. This uniquely powerful utility will even show you who owns each process.
    - Process Monitor - Monitor file system, Registry, process, thread and DLL activity in real-time.
    - ProcFeatures - This applet reports processor and Windows support for Physical Address Extensions and No Execute buffer overflow protection.
    - PsExec - Execute processes on remote systems.
    - PsFile - See what files are opened remotely.
    - PsGetSid - Displays the SID of a computer or a user.
    - PsInfo - Obtain information about a system.
    - PsKill - Terminate local or remote processes.
    - PsList - Show information about processes and threads.
    - PsLoggedOn - Show users logged on to a system.
    - PsLogList - Dump event log records.
    - PsPasswd - Changes account passwords.
    - PsService - View and control services.
    - PsShutdown - Shuts down and optionally reboots a computer.
    - PsSuspend - Suspend and resume processes.
    - RAMMap - An advanced physical memory usage analysis utility that presents usage information in different ways on its several different tabs.
    - RegDelNull - Scan for and delete Registry keys that contain embedded null-characters that are otherwise undeleteable by standard Registry-editing tools.
    - RegJump - Jump to the registry path you specify in Regedit.
    - RootkitRevealer - Scan your system for rootkit-based malware.
    - SDelete - Securely overwrite your sensitive files and cleanse your free space of previously deleted files using this DoD-compliant secure delete program.
    - ShareEnum - Scan file shares on your network and view their security settings to close security holes.
    - ShellRunas - Launch programs as a different user via a convenient shell context-menu entry.
    - Sigcheck - Dump file version information and verify that images on your system are digitally signed.
    - Streams - Reveal NTFS alternate streams.
    - Strings - Search for ANSI and UNICODE strings in binaryimages.
    - Sync - Flush cached data to disk.
    - TCPView - Active socket command-line viewer.
    - VMMap - VMMap is a process virtual and physical memory analysis utility.
    - VolumeId - Set Volume ID of FAT or NTFS drives.
    - Whois - See who owns an Internet address.
    - WinObj - The ultimate Object Manager namespace viewer is here.
    - ZoomIt - Presentation utility for zooming and drawing on the screen.

## 2. Process Explorer

- 윈도우의 작업관리자와 비슷한 도구로, 시스템의 프로세스를 관리할 수 있는 프로그램.
- 현재 실행중인 프로세스를 파악하고 우선권 변경, 정지, 강제 종료 등의 작업 지원
- 작업관리자보다 상세한 분석이 가능하며 보다 확장된 기능 지원
- 특정 파일에서 사용되는 파일이나 디렉토리, DLL등의 로드 정보 제공
- 어떤 프로그램이 특정 폴더나 디바이스에 접근하고 있는지 확인할 수 있다.
    - 예) 웹 캠의 불빛이 들어와서 사용중이라는 신호가 있을 때 웹 캠 기능을 사용하지 않고 있었다면, 어떤 프로세스가 접근 중이었는지 확인할 수 있다.

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled.png)

## 3. Autoruns

- 윈도우 시스템이 가동되어 사용자가 로그인 할 때 까지 자동으로 실행되는 드라이버, DLL등 다양한 등록값에 대한 정보를 제공하는 툴. 따라서 시작 프로그램을 분석과 관리 하는 툴.
- 부팅되면서 실행되거나 은닉하게 되는 악성프로그램들을 확인하고자 할 때 주로 사용.
- 시작 프로세스 조사, 브라우저 도우미 개체, 윈도우 탐색기 쉘 확장 처리 기능 추가, 레지스트리 및 숨긴 영역에 저장된 모든 이미지를 확인할 수 있는 기능이 존재.
- See what programs are configured to startup automatically when your system boots and you login. Autoruns also shows you the full list of Registry and file locations where applications can configure auto-start settings.

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%201.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%201.png)

## 4. Process Monitor

- 파일 시스템, 레지스트리, 프로세스 등의 실제 활동을 실시간 모니터링 하는 프로그램
- Monitor file system, Registry, process, thread and DLL activity in real-time.
- 응용 프로그램이 내 컴퓨터에서 오작동 할 때 / 프로그램의 성능이 저하되는 지점이 어딘지 찾고 싶을 때 / 특정 프로그램이 프로그램 내부에서 어떤 일을 하는지 분석하고 싶을 때 등
    - 레지스트리 활동 모니터링
    - 파일 시스템 활동 모니터링
    - 네트워크 활동 모니터링
    - 프로세스와 쓰레드 활동 모니터링
    - 이벤트 프로파일링

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%202.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%202.png)

## 5. PsTools

- 콘솔 명령어, 배치 파일에서 실행 가능한 12개의 윈도우 원격 관리 파일.
- cmd 명령 프롬프트에서 실행.
- 원격 시스템과 로컬 시스템 모두를 관리할 수 있다는 점
- Ps는 명령행 도구를 나열하는 표준 UNIX 프로세스의 이름이 ps와 관련이 있기 때문에 ps라는 접두어를 사용함.
- PsInfo
    - Execute processes on remote systems.
    - OS 기본 정보, 보안 업데이트 정보, 설치된 소프트웨어 정보 등을 알려줌

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%203.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%203.png)

- PsExec
    - Execute processes on remote systems.
    - 모든 사용자 컨텍스트에서 프로세스 실행

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%204.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%204.png)

    - 시스템 계정으로 cmd 실행

- PsFile
    - See what files are opened remotely.
    - 시스템에서 원격으로 연 파일을 표시

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%205.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%205.png)

- PsGetSid
    - Displays the SID of a computer or a user.
    - 컴퓨터 또는 사용자의 Windows SID(보안 식별자) 표시

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%206.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%206.png)

- PsKill
    - Terminate local or remote processes.
    - 이름 또는 PID를 사용하여 프로세스 중단

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%207.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%207.png)

    1480 : 인터넷 익스플로러 프로세스

    pskill 1480 (프로세스 번호) 실행 결과 : 익스플로러 꺼짐

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%208.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%208.png)

- PsList
    - Show information about processes and threads.
    - 실행중인 프로세스에 대한 자세한 정보 표시

    현재 실행중인 프로세스를 확인하는 명령어 tasklist 결과

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%209.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%209.png)

    pslist 실행 결과

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2010.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2010.png)

    더 자세하게 나오는 걸 알 수 있음. 

    - **Pri**: Priority
    - **Thd**: Number of Threads
    - **Hnd**: Number of Handles
    - **VM**: Virtual Memory
    - **WS**: Working Set
    - **Priv**: Private Virtual Memory
    - **Priv Pk**: Private Virtual Memory Peak
    - **Faults**: Page Faults
    - **NonP**: Non-Paged Pool
    - **Page**: Paged Pool
    - **Cswtch**: Context Switches

- PsLoggedOn
    - Show users logged on to a system.
    - 로컬로 로그온 한 사용자와 원격 리소스 공유 사용자를 모두 표시

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2011.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2011.png)

- PsLogList
    - Dump event log records.
    - windows 이벤트 로그 레코드를 덤프
    - 덤프 (dump) : 어떤 장애가 발생했을 때, 프로그램의 오류 수정이나 데이터 검사 (디버깅)을 하기 위해 그 상태를 출력장치 (프린터, 모니터)에 출력하는 행동. 주로 주기억장치에 올라온 내용의 전체나 일부를 확인한다.

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2012.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2012.png)

- PsPasswd
    - Changes account passwords.
    - 사용자 계정 암호 변경

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2013.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2013.png)

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2014.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2014.png)

- PsService
    - View and control services.
    - Windows 서비스 확인 및 제어
    - 로컬/원격의 서비스 상태의 표시와 제어

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2015.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2015.png)

    - 옵션에 따라 start, stop, restart등 할 수 있다.

- PsShutdown
    - Shuts down and optionally reboots a computer.
    - 컴퓨터를 종료, 재시작, 최대 절전 모드로 전환 또는 일시중단
    - -r : 재부팅
    - -h : 절전모드

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2016.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2016.png)

    20초 뒤,,, 

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2017.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2017.png)

- PsSuspend
    - Suspend and resume processes.
    - 실행중인 프로세스 일시 중단

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2018.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2018.png)

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2019.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2019.png)

    인터넷 익스플로러가 멈췄음

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2020.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2020.png)

## 6. TCPView

- 네트워크 동작 여부를 실시간으로 모니터링
- 실행중인 프로세스를 직접 종료 또는 연결 해제 가능
- Windows 운영체제에서 로컬 및 원격 주소와 연결되어있는 모든 프로세스, TCP/UDP의 엔드 포인트 정보를 모니터링 하는 도구.
- 엔드포인트 (Endpoint) : 어떠한 소프트웨어나 제품에 최종목적지인 사용자를 가르키며 PC나 노트북, 핸드폰 등 유저가 사용하는 디바이스를 뜻함.
    - 엔드포인트 위협 탐지 및 대응 (Endpoint Detection and Response, EDR) : 컴퓨터와 모바일, 서버 등 단말(Endpoint)에서 발생하는 악성행위를 실시간으로 감지하고 이를 분석 및 대응하여 피해확산을 막는 솔루션이다. 주로 악성코드, 랜섬웨어, 바이러스, 정보유출 차단목적으로 사용되나 ‘제로데이 공격(Zero day Exploit)’ 대응에 효과적인 것으로 알려져 있음.

    ![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2021.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2021.png)

## 7. DiskView

- Windows XP의 디스크 분석기 - 디스크 조각 모음을 수행하기 전에 디스크 분포를 조사, 조각 모음 여부를 결정하고 결과를 수직 막대 형태의 그래프로 보여줌.
- DiskView는 더 확장하여 수직 막대 그래프에서 사용자가 직접 탐색할 수 있는 하드디스크 섹터 지도를 출력해준다. 디스크 드라이브 분석 도구.
- 디스크에 실제로 파일이 배치되는 방법을 보여주며 특정 파일이 저장된 위치를 볼 수 있도록 한다.
- Graphical disk sector utility.

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2022.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2022.png)

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2023.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2023.png)

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2024.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2024.png)

## 8. ListDLLs

- 특정 프로세스에 로드 된 DLL 파일을 확인하는 방법
- 현재 이용하고 있는 DLL을 표시
- DLL (Dynamic link Library) : 동적 링크 라이브러리로 Windows에서 구현됨. 다른 프로그램에서 참조하여 사용할 수 있는 다양한 함수를 가지고 있고, 클래스를 가지고 있기도 함.
- List all the DLLs that are currently loaded, including where they are loaded and their version numbers. Version 2.0 prints the full path names of loaded modules.
- listdlls [-r] [-v | -u] [processname|pid]listdlls [-r] [-v] [-d dllname]
    - processname : 프로세스에 의해 로드된 DLL 덤프. 부분 이름도 가능
    - pid :  지정된 프로세스 ID와 연결된 DLL 덤프
    - dllname : 지정한 DLL을 로드한 프로세스만 표시.
    - -r : 기본 주소에 로드되지 않아 재배치 된 DLL 표시.
    - -u : unsigned DLL 리스트 표시.
    - -v : DLL 버전 정보 출력

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2025.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2025.png)

결과 : 

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2026.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2026.png)

윈도우 docs에 있는 예시 해보기 : 

- listdll -d mso.dll (MSO.dll를 로드한 프로세스 표시)

![Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2027.png](Sysinternals%20Suite%2017038900b1ca41b8b0d975317753319c/Untitled%2027.png)

(MSO.dll : MS 오피스 프로그램에서 사용되는 동적 라이브러리)
