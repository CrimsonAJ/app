.class public final Lco/notix/vh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8/O;


# instance fields
.field public final a:Lco/notix/kh;

.field public final b:Lb8/F;

.field public final c:Lg8/a;


# direct methods
.method public constructor <init>(Lco/notix/yh;Lco/notix/kh;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "fieldDelegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lco/notix/vh;->a:Lco/notix/kh;

    invoke-static {p3}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    move-result-object p2

    iput-object p2, p0, Lco/notix/vh;->b:Lb8/F;

    invoke-static {}, Lg8/e;->a()Lg8/d;

    move-result-object p2

    iput-object p2, p0, Lco/notix/vh;->c:Lg8/a;

    invoke-static {p1}, Lco/notix/yh;->a(Lco/notix/yh;)LY7/z;

    move-result-object p1

    new-instance p2, Lco/notix/nh;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lco/notix/nh;-><init>(Lco/notix/vh;LE7/d;)V

    const/4 v0, 0x3

    invoke-static {p1, p3, p2, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lco/notix/oh;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/oh;

    iget v1, v0, Lco/notix/oh;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/oh;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/oh;

    invoke-direct {v0, p0, p1}, Lco/notix/oh;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/oh;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/oh;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lco/notix/oh;->b:Lg8/a;

    iget-object v0, v0, Lco/notix/oh;->a:Lco/notix/vh;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/oh;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/oh;->b:Lg8/a;

    iput v3, v0, Lco/notix/oh;->e:I

    invoke-interface {p1, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    check-cast v0, Lb8/Q;

    invoke-virtual {v0, p1}, Lb8/Q;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, p1}, Lg8/a;->a(Ljava/lang/Object;)V

    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1

    :catchall_0
    move-exception v0

    invoke-interface {v1, p1}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0
.end method

.method public final a(LO7/l;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p2, Lco/notix/rh;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/rh;

    iget v1, v0, Lco/notix/rh;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/rh;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/rh;

    invoke-direct {v0, p0, p2}, Lco/notix/rh;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/rh;->d:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/rh;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/rh;->c:Lg8/a;

    iget-object v1, v0, Lco/notix/rh;->b:LO7/l;

    iget-object v0, v0, Lco/notix/rh;->a:Lco/notix/vh;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/rh;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/rh;->b:LO7/l;

    iput-object p2, v0, Lco/notix/rh;->c:Lg8/a;

    iput v3, v0, Lco/notix/rh;->f:I

    invoke-interface {p2, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    :cond_4
    move-object v2, v0

    check-cast v2, Lb8/Q;

    invoke-virtual {v2}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lb8/Q;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v3

    :catchall_0
    move-exception v0

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0
.end method

.method public final a(Lco/notix/yj;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 4
    instance-of v0, p2, Lco/notix/th;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/th;

    iget v1, v0, Lco/notix/th;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/th;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/th;

    invoke-direct {v0, p0, p2}, Lco/notix/th;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/th;->d:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/th;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/th;->c:Lg8/a;

    iget-object v1, v0, Lco/notix/th;->b:LO7/l;

    iget-object v0, v0, Lco/notix/th;->a:Lco/notix/vh;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/th;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/th;->b:LO7/l;

    iput-object p2, v0, Lco/notix/th;->c:Lg8/a;

    iput v3, v0, Lco/notix/th;->f:I

    invoke-interface {p2, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const/4 v1, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    :cond_4
    move-object v2, v0

    check-cast v2, Lb8/Q;

    invoke-virtual {v2}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p1, v3}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lb8/Q;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    invoke-interface {p2, v1}, Lg8/a;->a(Ljava/lang/Object;)V

    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2, v1}, Lg8/a;->a(Ljava/lang/Object;)V

    throw p1
.end method

.method public final a(Ljava/lang/Number;LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 3
    instance-of v0, p2, Lco/notix/sh;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/sh;

    iget v1, v0, Lco/notix/sh;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/sh;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/sh;

    invoke-direct {v0, p0, p2}, Lco/notix/sh;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/sh;->d:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/sh;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/sh;->c:Lg8/a;

    iget-object v1, v0, Lco/notix/sh;->b:Ljava/lang/Object;

    iget-object v0, v0, Lco/notix/sh;->a:Lco/notix/vh;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/sh;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/sh;->b:Ljava/lang/Object;

    iput-object p2, v0, Lco/notix/sh;->c:Lg8/a;

    iput v3, v0, Lco/notix/sh;->f:I

    invoke-interface {p2, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    check-cast v0, Lb8/Q;

    invoke-virtual {v0, v1}, Lb8/Q;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1

    :catchall_0
    move-exception v0

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p1, Lco/notix/qh;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/qh;

    iget v1, v0, Lco/notix/qh;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/qh;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/qh;

    invoke-direct {v0, p0, p1}, Lco/notix/qh;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/qh;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/qh;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lco/notix/qh;->b:Lg8/a;

    iget-object v0, v0, Lco/notix/qh;->a:Lco/notix/vh;

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    iget-object p1, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/qh;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/qh;->b:Lg8/a;

    iput v3, v0, Lco/notix/qh;->e:I

    invoke-interface {p1, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    check-cast v0, Lb8/Q;

    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, p1}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {v1, p1}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0
.end method

.method public final b(LO7/l;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p2, Lco/notix/uh;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/uh;

    iget v1, v0, Lco/notix/uh;->f:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/uh;->f:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/uh;

    invoke-direct {v0, p0, p2}, Lco/notix/uh;-><init>(Lco/notix/vh;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/uh;->d:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/uh;->f:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/uh;->c:Lg8/a;

    iget-object v1, v0, Lco/notix/uh;->b:LO7/l;

    iget-object v0, v0, Lco/notix/uh;->a:Lco/notix/vh;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/vh;->c:Lg8/a;

    iput-object p0, v0, Lco/notix/uh;->a:Lco/notix/vh;

    iput-object p1, v0, Lco/notix/uh;->b:LO7/l;

    iput-object p2, v0, Lco/notix/uh;->c:Lg8/a;

    iput v3, v0, Lco/notix/uh;->f:I

    invoke-interface {p2, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    move-object v1, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    :try_start_0
    iget-object v0, v0, Lco/notix/vh;->b:Lb8/F;

    :cond_4
    move-object v2, v0

    check-cast v2, Lb8/Q;

    invoke-virtual {v2}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lb8/Q;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_4

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    return-object v4

    :catchall_0
    move-exception v0

    invoke-interface {p1, p2}, Lg8/a;->a(Ljava/lang/Object;)V

    throw v0
.end method

.method public final collect(Lb8/f;LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lco/notix/ph;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lco/notix/ph;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/ph;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/ph;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/ph;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lco/notix/ph;-><init>(Lco/notix/vh;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lco/notix/ph;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/ph;->c:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-eq v2, v3, :cond_1

    .line 35
    .line 36
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_1
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, LA7/b;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p2, p0, Lco/notix/vh;->b:Lb8/F;

    .line 57
    .line 58
    iput v3, v0, Lco/notix/ph;->c:I

    .line 59
    .line 60
    check-cast p2, Lb8/Q;

    .line 61
    .line 62
    invoke-virtual {p2, p1, v0}, Lb8/Q;->collect(Lb8/f;LE7/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-object v1
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
.end method

.method public final getReplayCache()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lco/notix/vh;->b:Lb8/F;

    .line 2
    .line 3
    check-cast v0, Lb8/Q;

    .line 4
    .line 5
    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, LB6/u0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
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

.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lco/notix/vh;->b:Lb8/F;

    check-cast v0, Lb8/Q;

    invoke-virtual {v0}, Lb8/Q;->h()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
