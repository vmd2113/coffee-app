# <h1 align=center> coffee-app </h1>

## Cách lấy về:

- Fork repo này, sau đó, copy lại link repo (không phải link của repo này)
- Vào android studio (nếu vào mà nó mở project trước thì đóng nó lại) > `get from vcs` > paste link > tự hoàn thành nốt
- Làm gì thì làm :)))

## Sau khi làm, muốn up code:

- Mở terminal (`ctrl + alt + 1`)

  - Lệnh này chỉ cần làm 1 lần: `git remote add upstream https://github.com/Kritiqual/coffee-app`
  - `git add .`
  - `git commit -m "<commit message>"` (vừa làm gì thì ghi vào)
  - `git push origin master`
- Nếu muốn nhập vào repo này: Tạo __Pull request__

# Ghi chú:
- Mỗi khi mở project hãy cập nhật lại repo:
  - __Cách 1__: `Ctrl+Alt+W`, nó hiện bảng thì nhấn OK thôi 
  - __Cách 2__: Mở terminal, chạy lần lượt:
  ```
  git fetch upstream
  ```
  ```
  git checkout master 
  ```
  ```
  git merge upstream/master
  ```
- Mấy cái mà được nhắc đến thì tự nhìn xung quanh cái app ấy, kiểu gì chả ra :|
- Nên chỉnh cái này: `settings` > `Appearance & Behavior` > `System Settings` > Ở mục `Project`: bỏ chọn `Reopen project on startup`, xong thì bấm `apply` ở cuối cái bảng settings to lù lù đấy :)__
