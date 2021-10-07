<html>
<head>
<title>1473</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<style type="text/css">
.s0 { color: #808080;}
.s1 { color: #a9b7c6;}
.s2 { color: #cc7832;}
.s3 { color: #6897bb;}
.ln { color: #606366; font-weight: normal; font-style: normal; }
</style>
</head>
<body bgcolor="#2b2b2b">
<table CELLSPACING=0 CELLPADDING=5 COLS=1 WIDTH="100%" BGCOLOR="#606060" >
<tr><td><center>
<font face="Arial, Helvetica" color="#000000">
1473</font>
</center></td></tr></table>
<pre><a name="l1"><span class="ln">1    </span></a><span class="s0">//refer to https://walkccc.me/LeetCode/problems/1473/</span>
<a name="l2"><span class="ln">2    </span></a><span class="s2">class </span><span class="s1">Solution {</span>
<a name="l3"><span class="ln">3    </span></a>    <span class="s2">public int </span><span class="s1">minCost(</span><span class="s2">int</span><span class="s1">[] houses</span><span class="s2">, int</span><span class="s1">[][] cost</span><span class="s2">, int </span><span class="s1">m</span><span class="s2">, int </span><span class="s1">n</span><span class="s2">, int </span><span class="s1">target) {</span>
<a name="l4"><span class="ln">4    </span></a>        <span class="s1">dp = </span><span class="s2">new int</span><span class="s1">[target + </span><span class="s3">1</span><span class="s1">][m][n + </span><span class="s3">1</span><span class="s1">]</span><span class="s2">;</span>
<a name="l5"><span class="ln">5    </span></a>
<a name="l6"><span class="ln">6    </span></a>        <span class="s2">final int </span><span class="s1">j = minCost(houses</span><span class="s2">, </span><span class="s1">cost</span><span class="s2">, </span><span class="s1">m</span><span class="s2">, </span><span class="s1">n</span><span class="s2">, </span><span class="s1">target</span><span class="s2">, </span><span class="s3">0</span><span class="s2">, </span><span class="s3">0</span><span class="s1">)</span><span class="s2">;</span>
<a name="l7"><span class="ln">7    </span></a>        <span class="s2">return </span><span class="s1">j == Maxk ? -</span><span class="s3">1 </span><span class="s1">: j</span><span class="s2">;</span>
<a name="l8"><span class="ln">8    </span></a>    <span class="s1">}</span>
<a name="l9"><span class="ln">9    </span></a>
<a name="l10"><span class="ln">10   </span></a>    <span class="s2">public static final int </span><span class="s1">Maxk = (</span><span class="s2">int</span><span class="s1">) </span><span class="s3">1e6 </span><span class="s1">+ </span><span class="s3">1</span><span class="s2">;</span>
<a name="l11"><span class="ln">11   </span></a>    <span class="s2">public int</span><span class="s1">[][][] dp</span><span class="s2">;</span>
<a name="l12"><span class="ln">12   </span></a>
<a name="l13"><span class="ln">13   </span></a>    <span class="s2">public int </span><span class="s1">minCost(</span><span class="s2">int</span><span class="s1">[] houses</span><span class="s2">, int</span><span class="s1">[][] cost</span><span class="s2">, int </span><span class="s1">m</span><span class="s2">, int </span><span class="s1">n</span><span class="s2">, int </span><span class="s1">k</span><span class="s2">, int </span><span class="s1">i</span><span class="s2">, int </span><span class="s1">pc) {</span>
<a name="l14"><span class="ln">14   </span></a>        <span class="s2">if </span><span class="s1">(i == m || k &lt; </span><span class="s3">0</span><span class="s1">)</span>
<a name="l15"><span class="ln">15   </span></a>            <span class="s2">return </span><span class="s1">k == </span><span class="s3">0 </span><span class="s1">? </span><span class="s3">0 </span><span class="s1">: Maxk</span><span class="s2">;</span>
<a name="l16"><span class="ln">16   </span></a>        <span class="s2">if </span><span class="s1">(dp[k][i][pc] &gt; </span><span class="s3">0</span><span class="s1">)</span>
<a name="l17"><span class="ln">17   </span></a>            <span class="s2">return </span><span class="s1">dp[k][i][pc]</span><span class="s2">;</span>
<a name="l18"><span class="ln">18   </span></a>        <span class="s2">if </span><span class="s1">(houses[i] &gt; </span><span class="s3">0</span><span class="s1">)</span>
<a name="l19"><span class="ln">19   </span></a>            <span class="s2">return </span><span class="s1">minCost(houses</span><span class="s2">, </span><span class="s1">cost</span><span class="s2">, </span><span class="s1">m</span><span class="s2">, </span><span class="s1">n</span><span class="s2">, </span><span class="s1">k - (pc == houses[i] ? </span><span class="s3">0 </span><span class="s1">: </span><span class="s3">1</span><span class="s1">)</span><span class="s2">, </span><span class="s1">i + </span><span class="s3">1</span><span class="s2">, </span><span class="s1">houses[i])</span><span class="s2">;</span>
<a name="l20"><span class="ln">20   </span></a>
<a name="l21"><span class="ln">21   </span></a>        <span class="s2">int </span><span class="s1">ans = Maxk</span><span class="s2">;</span>
<a name="l22"><span class="ln">22   </span></a>
<a name="l23"><span class="ln">23   </span></a>        <span class="s2">for </span><span class="s1">(</span><span class="s2">int </span><span class="s1">c = </span><span class="s3">1</span><span class="s2">; </span><span class="s1">c &lt;= n</span><span class="s2">; </span><span class="s1">++c)</span>
<a name="l24"><span class="ln">24   </span></a>            <span class="s1">ans = Math.min(ans</span><span class="s2">,</span>
<a name="l25"><span class="ln">25   </span></a>                    <span class="s1">cost[i][c - </span><span class="s3">1</span><span class="s1">] + minCost(houses</span><span class="s2">, </span><span class="s1">cost</span><span class="s2">, </span><span class="s1">m</span><span class="s2">, </span><span class="s1">n</span><span class="s2">, </span><span class="s1">k - (pc == c ? </span><span class="s3">0 </span><span class="s1">: </span><span class="s3">1</span><span class="s1">)</span><span class="s2">, </span><span class="s1">i + </span><span class="s3">1</span><span class="s2">, </span><span class="s1">c))</span><span class="s2">;</span>
<a name="l26"><span class="ln">26   </span></a>
<a name="l27"><span class="ln">27   </span></a>        <span class="s2">return </span><span class="s1">dp[k][i][pc] = ans</span><span class="s2">;</span>
<a name="l28"><span class="ln">28   </span></a>    <span class="s1">}</span>
<a name="l29"><span class="ln">29   </span></a><span class="s1">}</span></pre>
</body>
</html>