.class public final Lco/notix/interstitial/InterstitialActivity;
.super Lco/notix/j6;
.source "SourceFile"


# instance fields
.field public final w:Lco/notix/ia;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/notix/j6;-><init>()V

    invoke-static {}, Lco/notix/wq;->g()Lco/notix/ia;

    move-result-object v0

    iput-object v0, p0, Lco/notix/interstitial/InterstitialActivity;->w:Lco/notix/ia;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "start_id"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LA7/n;->a:LA7/n;

    if-eqz p1, :cond_1

    .line 4
    iget-object v1, p0, Lco/notix/j6;->i:Lco/notix/d;

    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    iget-object v1, v1, Lco/notix/d;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/notix/e;

    .line 7
    instance-of v1, p1, Lco/notix/gc;

    if-eqz v1, :cond_0

    check-cast p1, Lco/notix/gc;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 8
    iget-object v1, p1, Lco/notix/gc;->b:Lco/notix/interstitial/InterstitialButton;

    .line 9
    iput-object v1, p0, Lco/notix/j6;->j:Lco/notix/interstitial/InterstitialButton;

    .line 10
    iget-object v1, p1, Lco/notix/gc;->a:Lco/notix/i;

    .line 11
    const-string v2, "<set-?>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lco/notix/zb;->c:Lco/notix/g;

    .line 12
    iget-boolean v1, p1, Lco/notix/gc;->c:Z

    .line 13
    iput-boolean v1, p0, Lco/notix/zb;->d:Z

    .line 14
    iget-object v1, p1, Lco/notix/gc;->d:LO7/a;

    .line 15
    iput-object v1, p0, Lco/notix/zb;->e:LO7/a;

    .line 16
    iget-object p1, p1, Lco/notix/gc;->e:LO7/a;

    .line 17
    iput-object p1, p0, Lco/notix/zb;->f:LO7/a;

    return-object v0

    .line 18
    :cond_1
    sget-object p1, Lco/notix/p8;->d:Lco/notix/p8;

    invoke-virtual {p0, p1}, Lco/notix/zb;->a(Lco/notix/p8;)V

    return-object v0
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/notix/interstitial/InterstitialActivity;->w:Lco/notix/ia;

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v1

    check-cast v1, Lco/notix/i;

    .line 1
    iget-object v1, v1, Lco/notix/i;->h:Ljava/lang/String;

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    invoke-static {v1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lco/notix/ia;->c:LY7/z;

    new-instance v2, Lco/notix/da;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v1, v3}, Lco/notix/da;-><init>(Lco/notix/ia;Ljava/lang/String;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v3, v2, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method
