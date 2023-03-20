/**
 * 
 * @authors Your Name (you@example.org)
 * @date    2018-12-24 21:04:47
 * @version $Id$
 */
$(document).ready(function(){
	navbarbounce();
	slidebarcardflag();
	newsitems();
})
function navbarbounce(){
	$('.navbar-brand').hover(function(){
		$('.navbar-brand').addClass("bounce animated")
	},function(){
		$('.navbar-brand').removeClass("bounce animated")
	})
}

function slidebarcardflag(){
	$('.text-lg').hover(function(){
		$('.text-lg').addClass("rubberBand animated")
	},function(){
		$('.text-lg').removeClass("rubberBand animated")
	})
}

function newsitems(){
	$('.news-list-item').each(function(){
		$(this).hover(function(){
		$(this).addClass("pulse animated")
	},function(){
		$(this).removeClass("pulse animated")
	})
	})
}
