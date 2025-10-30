.class public final Lco/notix/ed;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/er;

.field public final b:Lco/notix/er;


# direct methods
.method public constructor <init>(Lco/notix/di;)V
    .locals 4

    const-string v0, "objectStorageProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "lsi_manager"

    invoke-static {p1, v0}, Lco/notix/ai;->a(Lco/notix/di;Ljava/lang/String;)Lco/notix/er;

    move-result-object p1

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/ad;

    const-string v2, "period_millis"

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lco/notix/ad;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/ed;->a:Lco/notix/er;

    new-instance v0, Lco/notix/er;

    new-instance v1, Lco/notix/dd;

    const-string v2, "zone_id"

    invoke-direct {v1, p1, v2, v3}, Lco/notix/dd;-><init>(Lco/notix/er;Ljava/lang/String;LE7/d;)V

    invoke-direct {v0, v1}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object v0, p0, Lco/notix/ed;->b:Lco/notix/er;

    return-void
.end method


# virtual methods
.method public final a(JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p3, Lco/notix/wc;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/wc;

    iget v1, v0, Lco/notix/wc;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/wc;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/wc;

    invoke-direct {v0, p0, p3}, Lco/notix/wc;-><init>(Lco/notix/ed;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/wc;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/wc;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/wc;->a:J

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/ed;->a:Lco/notix/er;

    iput-wide p1, v0, Lco/notix/wc;->a:J

    iput v4, v0, Lco/notix/wc;->d:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lco/notix/vh;

    .line 3
    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 4
    iput v3, v0, Lco/notix/wc;->d:I

    invoke-virtual {p3, v2, v0}, Lco/notix/vh;->a(Ljava/lang/Number;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/uc;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/uc;

    iget v1, v0, Lco/notix/uc;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/uc;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/uc;

    invoke-direct {v0, p0, p1}, Lco/notix/uc;-><init>(Lco/notix/ed;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/uc;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/uc;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/ed;->a:Lco/notix/er;

    iput v4, v0, Lco/notix/uc;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/uc;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method

.method public final b(JLE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p3, Lco/notix/xc;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/xc;

    iget v1, v0, Lco/notix/xc;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/xc;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/xc;

    invoke-direct {v0, p0, p3}, Lco/notix/xc;-><init>(Lco/notix/ed;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/xc;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/xc;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide p1, v0, Lco/notix/xc;->a:J

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/ed;->b:Lco/notix/er;

    iput-wide p1, v0, Lco/notix/xc;->a:J

    iput v4, v0, Lco/notix/xc;->d:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lco/notix/vh;

    .line 3
    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 4
    iput v3, v0, Lco/notix/xc;->d:I

    invoke-virtual {p3, v2, v0}, Lco/notix/vh;->a(Ljava/lang/Number;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, Lco/notix/vc;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/vc;

    iget v1, v0, Lco/notix/vc;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/vc;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/vc;

    invoke-direct {v0, p0, p1}, Lco/notix/vc;-><init>(Lco/notix/ed;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/vc;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/vc;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/ed;->b:Lco/notix/er;

    iput v4, v0, Lco/notix/vc;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/vc;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1
.end method
