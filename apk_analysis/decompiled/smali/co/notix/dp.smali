.class public final Lco/notix/dp;
.super Lco/notix/t8;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/ee;


# direct methods
.method public constructor <init>(Lco/notix/ie;)V
    .locals 1

    const-string v0, "metricsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lco/notix/t8;-><init>()V

    iput-object p1, p0, Lco/notix/dp;->a:Lco/notix/ee;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 2
    instance-of v0, p1, Lco/notix/cp;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/cp;

    iget v1, v0, Lco/notix/cp;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/cp;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/cp;

    invoke-direct {v0, p0, p1}, Lco/notix/cp;-><init>(Lco/notix/dp;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/cp;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/cp;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/dp;->a:Lco/notix/ee;

    iput v3, v0, Lco/notix/cp;->c:I

    check-cast p1, Lco/notix/ie;

    invoke-virtual {p1, v0}, Lco/notix/ie;->c(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-ne p1, v3, :cond_4

    sget-object p1, Lco/notix/v8;->a:Lco/notix/v8;

    return-object p1

    :cond_4
    if-nez p1, :cond_5

    sget-object p1, Lco/notix/v8;->b:Lco/notix/v8;

    return-object p1

    :cond_5
    new-instance p1, LA7/b;

    .line 3
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 4
    throw p1
.end method

.method public final bridge synthetic a(Lco/notix/u8;Lco/notix/mj;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lco/notix/ep;

    invoke-virtual {p0, p2}, Lco/notix/dp;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
