.class public final LI0/v;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:LG7/j;


# direct methods
.method public constructor <init>(LO7/p;LE7/d;)V
    .locals 0

    .line 1
    check-cast p1, LG7/j;

    .line 2
    .line 3
    iput-object p1, p0, LI0/v;->s:LG7/j;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 2

    .line 1
    new-instance v0, LI0/v;

    .line 2
    .line 3
    iget-object v1, p0, LI0/v;->s:LG7/j;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LI0/v;-><init>(LO7/p;LE7/d;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LI0/v;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
    .line 11
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LI0/v;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LI0/v;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, LI0/v;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LI0/v;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LY7/z;

    .line 7
    .line 8
    invoke-interface {p1}, LY7/z;->g()LE7/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, LE7/e;->a:LE7/e;

    .line 13
    .line 14
    invoke-interface {p1, v0}, LE7/i;->get(LE7/h;)LE7/g;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {p1}, Lkotlin/jvm/internal/h;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    check-cast p1, LE7/f;

    .line 22
    .line 23
    new-instance v1, LY7/n;

    .line 24
    .line 25
    invoke-direct {v1}, LY7/n;-><init>()V

    .line 26
    .line 27
    .line 28
    sget-object v2, LY7/A;->d:LY7/A;

    .line 29
    .line 30
    new-instance v3, LI0/t;

    .line 31
    .line 32
    iget-object v4, p0, LI0/v;->s:LG7/j;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {v3, v1, v4, v5}, LI0/t;-><init>(LY7/n;LO7/p;LE7/d;)V

    .line 36
    .line 37
    .line 38
    sget-object v4, LE7/j;->a:LE7/j;

    .line 39
    .line 40
    const/4 v6, 0x1

    .line 41
    invoke-static {v4, p1, v6}, LY7/B;->i(LE7/i;LE7/i;Z)LE7/i;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    sget-object v7, LY7/K;->a:Lf8/e;

    .line 46
    .line 47
    if-eq v4, v7, :cond_0

    .line 48
    .line 49
    invoke-interface {v4, v0}, LE7/i;->get(LE7/h;)LE7/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    invoke-interface {v4, v7}, LE7/i;->plus(LE7/i;)LE7/i;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    :cond_0
    new-instance v0, LY7/y0;

    .line 60
    .line 61
    invoke-direct {v0, v4, v6}, LY7/a;-><init>(LE7/i;Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2, v0, v3}, LY7/a;->c0(LY7/A;LY7/a;LO7/p;)V

    .line 65
    .line 66
    .line 67
    :catch_0
    invoke-virtual {v1}, LY7/r0;->D()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    instance-of v0, v0, LY7/a0;

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    :try_start_0
    new-instance v0, LI0/u;

    .line 76
    .line 77
    invoke-direct {v0, v1, v5}, LI0/u;-><init>(LY7/n;LE7/d;)V

    .line 78
    .line 79
    .line 80
    invoke-static {p1, v0}, LY7/B;->v(LE7/i;LO7/p;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    return-object p1

    .line 85
    :cond_1
    invoke-virtual {v1}, LY7/r0;->y()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    return-object p1
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
