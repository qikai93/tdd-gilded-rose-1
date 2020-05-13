## 条件
价值区间【0，50】

### tasking 1
given 普通商品 过期天数 价值
when 当前天数(<=过期天数)
then 当前价值

### tasking 2
given 普通商品 过期天数 价值
when 当前天数（>过期天数）
then 当前价值

### tasking 3
given 萨弗拉斯（`Sulfuras`） 过期天数 价值
when 当前天数
then 当前价值

### tasking 4
given 陈年干酪（`Aged Brie`) 过期天数 价值
when 当前天数（<=过期天数）
then 当前价值

### tasking 5
given 陈年干酪（`Aged Brie`) 过期天数 价值
when 当前天数（>过期天数）
then 当前价值

### tasking 6
given 后台门票（`Backstage pass`） 过期天数 价值
when 当前天数（>过期天数）
then 0

### tasking 7
given 后台门票（`Backstage pass`） 过期天数 价值
when 当前天数（5< x <=过期天数-10）
then 当前价值


### tasking 8
given 后台门票（`Backstage pass`） 过期天数 价值
when 当前天数（x <=过期天数-5）
then 当前价值
