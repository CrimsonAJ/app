.class public final Lco/notix/ej;
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

    iput-object p1, p0, Lco/notix/ej;->a:Lco/notix/di;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/bj;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lco/notix/bj;-><init>(Lco/notix/ej;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/ej;->b:Lco/notix/er;

    new-instance p1, Lco/notix/er;

    new-instance v0, Lco/notix/zi;

    invoke-direct {v0, p0, v1}, Lco/notix/zi;-><init>(Lco/notix/ej;LE7/d;)V

    invoke-direct {p1, v0}, Lco/notix/er;-><init>(LO7/l;)V

    iput-object p1, p0, Lco/notix/ej;->c:Lco/notix/er;

    return-void
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 2
    instance-of v0, p1, Lco/notix/qi;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lco/notix/qi;

    iget v1, v0, Lco/notix/qi;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/qi;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/qi;

    invoke-direct {v0, p0, p1}, Lco/notix/qi;-><init>(Lco/notix/ej;LE7/d;)V

    :goto_0
    iget-object p1, v0, Lco/notix/qi;->a:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/qi;->c:I

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

    iget-object p1, p0, Lco/notix/ej;->c:Lco/notix/er;

    iput v4, v0, Lco/notix/qi;->c:I

    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    iput v3, v0, Lco/notix/qi;->c:I

    invoke-virtual {p1, v0}, Lco/notix/vh;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    return-object p1
.end method

.method public final a(Lco/notix/ni;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lco/notix/oi;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/oi;

    iget v1, v0, Lco/notix/oi;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/oi;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/oi;

    invoke-direct {v0, p0, p2}, Lco/notix/oi;-><init>(Lco/notix/ej;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/oi;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/oi;->d:I

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
    iget-object p1, v0, Lco/notix/oi;->a:Lco/notix/ni;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/ej;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/oi;->a:Lco/notix/ni;

    iput v4, v0, Lco/notix/oi;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/pi;

    invoke-direct {v2, p1}, Lco/notix/pi;-><init>(Lco/notix/ni;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/oi;->a:Lco/notix/ni;

    iput v3, v0, Lco/notix/oi;->d:I

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

    .line 3
    instance-of v0, p2, Lco/notix/ri;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lco/notix/ri;

    iget v1, v0, Lco/notix/ri;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/ri;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/ri;

    invoke-direct {v0, p0, p2}, Lco/notix/ri;-><init>(Lco/notix/ej;LE7/d;)V

    :goto_0
    iget-object p2, v0, Lco/notix/ri;->b:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/ri;->d:I

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
    iget-object p1, v0, Lco/notix/ri;->a:Ljava/lang/String;

    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    iget-object p2, p0, Lco/notix/ej;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/ri;->a:Ljava/lang/String;

    iput v4, v0, Lco/notix/ri;->d:I

    invoke-virtual {p2, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lco/notix/vh;

    new-instance v2, Lco/notix/si;

    invoke-direct {v2, p1}, Lco/notix/si;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/ri;->a:Ljava/lang/String;

    iput v3, v0, Lco/notix/ri;->d:I

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

.method public final a(Ljava/lang/String;Lco/notix/ij;LE7/d;)Ljava/lang/Object;
    .locals 5

    .line 4
    instance-of v0, p3, Lco/notix/cj;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lco/notix/cj;

    iget v1, v0, Lco/notix/cj;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lco/notix/cj;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lco/notix/cj;

    invoke-direct {v0, p0, p3}, Lco/notix/cj;-><init>(Lco/notix/ej;LE7/d;)V

    :goto_0
    iget-object p3, v0, Lco/notix/cj;->c:Ljava/lang/Object;

    sget-object v1, LF7/a;->a:LF7/a;

    iget v2, v0, Lco/notix/cj;->e:I

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
    iget-object p2, v0, Lco/notix/cj;->b:LO7/l;

    iget-object p1, v0, Lco/notix/cj;->a:Ljava/lang/String;

    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    iget-object p3, p0, Lco/notix/ej;->c:Lco/notix/er;

    iput-object p1, v0, Lco/notix/cj;->a:Ljava/lang/String;

    iput-object p2, v0, Lco/notix/cj;->b:LO7/l;

    iput v4, v0, Lco/notix/cj;->e:I

    invoke-virtual {p3, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p3, Lco/notix/vh;

    new-instance v2, Lco/notix/dj;

    invoke-direct {v2, p1, p2}, Lco/notix/dj;-><init>(Ljava/lang/String;LO7/l;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lco/notix/cj;->a:Ljava/lang/String;

    iput-object p1, v0, Lco/notix/cj;->b:LO7/l;

    iput v3, v0, Lco/notix/cj;->e:I

    invoke-virtual {p3, v2, v0}, Lco/notix/vh;->b(LO7/l;LE7/d;)Ljava/lang/Object;

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
    instance-of v0, p1, Lco/notix/aj;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/aj;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/aj;->c:I

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
    iput v1, v0, Lco/notix/aj;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/aj;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/aj;-><init>(Lco/notix/ej;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/aj;->a:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/aj;->c:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_3

    .line 34
    .line 35
    if-eq v2, v4, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lco/notix/ej;->c:Lco/notix/er;

    .line 59
    .line 60
    iput v4, v0, Lco/notix/aj;->c:I

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Lco/notix/er;->a(LE7/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_4

    .line 67
    .line 68
    goto :goto_2

    .line 69
    :cond_4
    :goto_1
    check-cast p1, Lco/notix/vh;

    .line 70
    .line 71
    iput v3, v0, Lco/notix/aj;->c:I

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Lco/notix/vh;->b(LE7/d;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_5

    .line 78
    .line 79
    :goto_2
    return-object v1

    .line 80
    :cond_5
    return-object p1
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
.end method
