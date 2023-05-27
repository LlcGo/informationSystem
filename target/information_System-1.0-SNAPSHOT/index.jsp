
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/index.css">
    <script type="text/javascript" src="./js/index.js"></script>
</head>
<body>
<header>
<%--    <form action="product" method="get">--%>
<%--        <input type="hidden" name="name"  value="getall">--%>
<%--        <input type="submit" value="产品介绍">--%>
<%--    </form>--%>
    <ul>
        <li><a href="./index.jsp">银行介绍</a></li>
        <li><a onclick="go()" style="cursor:pointer">产品介绍</a></li>
    </ul>
</header>
<main >
    <div class="text">
        <h1>银行</h1>
        <p style="color: white">银行（Bank），是依法成立的经营货币信贷业务的金融机构，是商品货币经济发展到一定阶段的产物。
            银行是金融机构之一，银行按类型分为：中央银行、政策性银行、商业银行、专营机构、投资银行、世界银行，它们的职责各不相同。
            中央银行：即中国人民银行是中国的中央银行。 国有政策性银行：包括中国进出口银行、中国农业发展银行、国家开发银行。</p>
    </div>
    <div class="ping">
        <p class="p1" style="color: white">包括中国工商银行、中国农业银行、中国银行、中国建设银行、中国邮政储蓄银行、交通银行等。<span>————国有商业银行</span></p>
        <p class="p2" style="color: white">指商业银行针对本行某一特定领域业务所设立的、有别于传统分支行的机构。<span>————专营机构</span></p>
        <p class="p3" style="color: white">包括高盛集团、摩根士丹利、花旗集团、富国银行、瑞银集团、法国兴业银行等。。<span>————投资银行</span>
        </p>
    </div>
</main>
<footer>

</footer>
</body>
</html>
