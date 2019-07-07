package tr.xip.wanikani.userscripts;

/**

@author tryforceful
* DISCLAIMER: I am not responsible for any problems caused by this script.



*/

public class EnhanceMobileCSS {

  public static final String JS_CODE =
      "style = document.createElement('style');" +
      "style.type = 'text/css';" +
      "style.innerHTML = '" +
      "@media (max-width:767px){#summary-button{display:none;top:10px;left:20px;font-size:100%}#additional-content ul li:not(#option-audio) span:hover:before{content:none}#additional-content ul li span{padding:20px 10px;font-size:120%}#item-info{font-size:100%}#item-info #item-info-col1 section,#item-info #item-info-col2 section{margin-bottom:1.5em}#item-info #item-info-col1{padding-bottom:1.5em}#item-info #item-info-col2{padding-left:0}#answer-form button{font-size:1.5em}#answer-form fieldset.correct button,#answer-form fieldset.correct input[type=text],#answer-form fieldset.correct input[type=text]:disabled,#answer-form fieldset.incorrect button,#answer-form fieldset.incorrect input[type=text],#answer-form fieldset.incorrect input[type=text]:disabled{text-shadow:2px 2px 0 rgba(0,0,0,.2)}#answer-form input[type=text]{font-size:1.5em}#answer-exception{top:3.5em;font-size:1em}#kana-chart{font-size:100%}#last-items{font-size:100%}#last-items #last-items-list>ul>li{margin:0 6.6666666667px 6.6666666667px 0}#question #character{font-size:15vw;padding-top:2vw;font-weight:400;line-height:25vw}#question #character.kanji{text-shadow:5px 5px 0 #dd0093}#question #character.radical{text-shadow:5px 5px 0 #0093dd}#question #character.radical img{width:15vw;height:15vw}#question #character.vocabulary{font-size:15vw;line-height:25vw;text-shadow:5px 5px 0 #9300dd}#question #question-type h1{font-size:1.3em}#reviews footer #hotkeys,#reviews footer #report-errors{display:inline-block}#reviews-summary{font-size:100%}#reviews-summary header h1{margin:20px 0 0;padding-top:0}#reviews-summary header nav{position:relative}#reviews-summary header nav #start-session{float:right}#reviews-summary #correct h2,#reviews-summary #correct>div,#reviews-summary #incorrect h2,#reviews-summary #incorrect>div{padding:10px}#reviews-summary #review-stats [class*=pure-u-]:first-child [id*=review-stats-]:after{top:20%;right:-1.4em;border-width:1.5em 0 1.5em 1.5em}#reviews-summary #review-stats [class*=pure-u-]:first-child [id*=review-stats-] .review-stats-value{font-size:1.5em;line-height:1em}#reviews-summary #review-stats [id*=review-stats-] div{padding-left:10px;padding-right:10px}#reviews-summary #review-stats [id*=review-stats-] div:first-child{padding:10px 10px 0}#reviews-summary #review-stats [id*=review-stats-] div:last-child{padding:0 10px 10px}#reviews-summary #review-stats .review-stats-value{font-size:1.5em}#stats{padding:5px 10px;font-size:16px}#stats i{margin-right:.25em;margin-left:.4em}.srs{font-size:1.5em;top:.7em;text-align:left;left:.4em;position:fixed}.srs>div{animation-duration:1s;-webkit-animation-name:fadeIn;-moz-animation-name:fadeIn;-o-animation-name:fadeIn;animation-name:fadeIn}@-webkit-keyframes fadeIn{0%{opacity:0}100%{opacity:1}}@-moz-keyframes fadeIn{0%{opacity:0}100%{opacity:1}}@-o-keyframes fadeIn{0%{opacity:0}100%{opacity:1}}@keyframes fadeIn{0%{opacity:0}100%{opacity:1}}}"
      + "';" +
      "document.getElementsByTagName('head')[0].appendChild(style);";

}
