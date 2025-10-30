.class public final Lco/notix/m5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/di;

.field public final b:Lco/notix/er;

.field public final c:Lco/notix/er;


# direct methods
.method public constructor <init>(Lco/notix/di;)V
    .locals 2

    const-string v0, "objectStorageProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/m5;->a:Lco/notix/di;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/l5;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lco/notix/l5;-><init>(Lco/notix/m5;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/m5;->b:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/e5;

    invoke-direct {v0, p0, v1}, Lco/notix/e5;-><init>(Lco/notix/m5;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/m5;->c:Lco/notix/er;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p1, Lco/notix/w4;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/w4;

    iget v1, v0, Lco/notix/w4;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/w4;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/w4;

    invoke-direct {v0, p0, p1}, Lco/notix/w4;-><init>(Lco/notix/m5;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/w4;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/w4;->c:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

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

    iget-object p1, p0, Lco/notix/m5;->c:Lco/notix/er;

    iput v4, v0, Lco/notix/w4;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    sget-object v2, Lco/notix/x4;->a:Lco/notix/x4;

    iput v3, v0, Lco/notix/w4;->c:I

    invoke-virtual {p1, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(Lco/notix/o4;LE7/d;)Ljava/lang/Object;
    .locals 4

    .line 3
    instance-of v0, p2, Lco/notix/i5;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/i5;

    iget v1, v0, Lco/notix/i5;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/i5;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/i5;

    invoke-direct {v0, p0, p2}, Lco/notix/i5;-><init>(Lco/notix/m5;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/i5;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/i5;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lco/notix/i5;->a:Lco/notix/o4;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/m5;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/i5;->a:Lco/notix/o4;

    iput v3, v0, Lco/notix/i5;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lb8/e;

    new-instance v0, Lco/notix/h5;

    invoke-direct {v0, p2, p1}, Lco/notix/h5;-><init>(Lb8/e;Lco/notix/o4;)V

    return-object v0
.end method

.method public final a(Lco/notix/t4;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lco/notix/u4;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/u4;

    iget v1, v0, Lco/notix/u4;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/u4;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/u4;

    invoke-direct {v0, p0, p2}, Lco/notix/u4;-><init>(Lco/notix/m5;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/u4;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/u4;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/u4;->a:Lco/notix/t4;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/m5;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/u4;->a:Lco/notix/t4;

    iput v4, v0, Lco/notix/u4;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/v4;

    invoke-direct {v2, p1}, Lco/notix/v4;-><init>(Lco/notix/t4;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/u4;->a:Lco/notix/t4;

    iput v3, v0, Lco/notix/u4;->d:I

    invoke-virtual {p2, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(Ljava/lang/String;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 4
    instance-of v0, p2, Lco/notix/j5;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/j5;

    iget v1, v0, Lco/notix/j5;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/j5;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/j5;

    invoke-direct {v0, p0, p2}, Lco/notix/j5;-><init>(Lco/notix/m5;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/j5;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/j5;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lco/notix/j5;->a:Ljava/lang/String;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/m5;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/j5;->a:Ljava/lang/String;

    iput v4, v0, Lco/notix/j5;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/k5;

    invoke-direct {v2, p1}, Lco/notix/k5;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/j5;->a:Ljava/lang/String;

    iput v3, v0, Lco/notix/j5;->d:I

    invoke-virtual {p2, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method
