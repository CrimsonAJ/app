.class public final Lco/notix/lsi/LockScreenInterstitialActivity;
.super Lco/notix/j6;
.source "SourceFile"


# static fields
.field public static final synthetic D:I


# instance fields
.field public final A:Lco/notix/mq;

.field public final B:LY7/z;

.field public final C:Lb8/E;

.field public final w:Lco/notix/ia;

.field public final x:Lco/notix/mg;

.field public final y:Lco/notix/c8;

.field public final z:Lco/notix/tc;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lco/notix/j6;-><init>()V

    invoke-static {}, Lco/notix/wq;->g()Lco/notix/ia;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->w:Lco/notix/ia;

    new-instance v0, Lco/notix/mg;

    invoke-direct {v0}, Lco/notix/mg;-><init>()V

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->x:Lco/notix/mg;

    invoke-static {}, Lco/notix/wq;->d()Lco/notix/c8;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->y:Lco/notix/c8;

    invoke-static {}, Lco/notix/wq;->j()Lco/notix/tc;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->z:Lco/notix/tc;

    invoke-static {}, Lco/notix/wq;->E()Lco/notix/mq;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->A:Lco/notix/mq;

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object v0

    invoke-virtual {v0}, Lco/notix/g9;->c()LY7/z;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->B:LY7/z;

    const/4 v0, 0x2

    invoke-static {v0}, Lb8/M;->b(I)Lb8/L;

    move-result-object v0

    iput-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->C:Lb8/E;

    return-void
.end method

.method public static final synthetic a(Lco/notix/lsi/LockScreenInterstitialActivity;J)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lco/notix/zb;->a(J)V

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, Lco/notix/pc;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/pc;

    iget v1, v0, Lco/notix/pc;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/pc;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/pc;

    invoke-direct {v0, p0, p1}, Lco/notix/pc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/pc;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/pc;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lco/notix/pc;->a:Lco/notix/lsi/LockScreenInterstitialActivity;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lco/notix/zb;->b:LY7/z;

    .line 9
    new-instance v2, Lco/notix/qc;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lco/notix/qc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;LE7/d;)V

    const/4 v5, 0x3

    invoke-static {p1, v4, v2, v5}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    move-result-object p1

    iput-object p0, v0, Lco/notix/pc;->a:Lco/notix/lsi/LockScreenInterstitialActivity;

    iput v3, v0, Lco/notix/pc;->d:I

    invoke-virtual {p1, v0}, LY7/r0;->N(LG7/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    new-instance p1, Lco/notix/rc;

    invoke-direct {p1, v0}, Lco/notix/rc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;)V

    .line 10
    iput-object p1, v0, Lco/notix/zb;->e:LO7/a;

    .line 11
    new-instance p1, Lco/notix/sc;

    invoke-direct {p1, v0}, Lco/notix/sc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;)V

    .line 12
    iput-object p1, v0, Lco/notix/zb;->f:LO7/a;

    .line 13
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(J)V
    .locals 3

    .line 6
    iget-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->B:LY7/z;

    new-instance v1, Lco/notix/mc;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lco/notix/mc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;JLE7/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final a(Lco/notix/p8;)V
    .locals 5

    const-string v0, "reason"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->w:Lco/notix/ia;

    invoke-virtual {p0}, Lco/notix/zb;->c()Lco/notix/g;

    move-result-object v1

    check-cast v1, Lco/notix/i;

    .line 2
    iget-object v1, v1, Lco/notix/i;->h:Ljava/lang/String;

    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    const-string v2, "data"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lco/notix/ia;->c:LY7/z;

    new-instance v3, Lco/notix/ba;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, p1, v4}, Lco/notix/ba;-><init>(Lco/notix/ia;Ljava/lang/String;Lco/notix/p8;LE7/d;)V

    const/4 p1, 0x3

    invoke-static {v2, v4, v3, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 7
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->B:LY7/z;

    new-instance v0, Lco/notix/oc;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lco/notix/oc;-><init>(Lco/notix/lsi/LockScreenInterstitialActivity;LE7/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v0, v2}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public final onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lco/notix/lsi/LockScreenInterstitialActivity;->C:Lb8/E;

    .line 5
    .line 6
    sget-object v1, LA7/n;->a:LA7/n;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Lb8/E;->d(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.NotificationManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/NotificationManager;

    const v1, 0x49dd513f

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    return-void
.end method
