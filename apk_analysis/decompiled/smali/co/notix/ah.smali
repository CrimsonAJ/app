.class public final Lco/notix/ah;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public a:I

.field public final synthetic b:Lco/notix/ch;


# direct methods
.method public constructor <init>(Lco/notix/ch;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/ah;->b:Lco/notix/ch;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
    .line 9
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
    .locals 1

    .line 1
    new-instance p1, Lco/notix/ah;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/ah;->b:Lco/notix/ch;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/ah;-><init>(Lco/notix/ch;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
    .line 9
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/ah;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/ah;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/ah;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, LF7/a;->a:LF7/a;

    .line 3
    .line 4
    iget v2, p0, Lco/notix/ah;->a:I

    .line 5
    .line 6
    sget-object v3, LA7/n;->a:LA7/n;

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-ne v2, v0, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lco/notix/ah;->b:Lco/notix/ch;

    .line 28
    .line 29
    iget-object p1, p1, Lco/notix/ch;->c:Lco/notix/lf;

    .line 30
    .line 31
    iget-object p1, p1, Lco/notix/lf;->c:LA7/e;

    .line 32
    .line 33
    invoke-interface {p1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lb8/O;

    .line 38
    .line 39
    iget-object v2, p0, Lco/notix/ah;->b:Lco/notix/ch;

    .line 40
    .line 41
    iget-object v4, v2, Lco/notix/ch;->i:Lco/notix/na;

    .line 42
    .line 43
    check-cast v4, Lco/notix/ra;

    .line 44
    .line 45
    iget-object v4, v4, Lco/notix/ra;->e:Lb8/O;

    .line 46
    .line 47
    new-instance v5, Lco/notix/zg;

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    invoke-direct {v5, v2, v6}, Lco/notix/zg;-><init>(Lco/notix/ch;LE7/d;)V

    .line 51
    .line 52
    .line 53
    iput v0, p0, Lco/notix/ah;->a:I

    .line 54
    .line 55
    sget-object v2, Lc8/x;->a:Lc8/x;

    .line 56
    .line 57
    const/4 v7, 0x2

    .line 58
    new-array v7, v7, [Lb8/e;

    .line 59
    .line 60
    const/4 v8, 0x0

    .line 61
    aput-object p1, v7, v8

    .line 62
    .line 63
    aput-object v4, v7, v0

    .line 64
    .line 65
    new-instance p1, Lb8/C;

    .line 66
    .line 67
    invoke-direct {p1, v5, v6}, Lb8/C;-><init>(LO7/q;LE7/d;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1, v2, v7}, Lc8/c;->a(LE7/d;LO7/q;Lb8/f;[Lb8/e;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-ne p1, v1, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move-object p1, v3

    .line 78
    :goto_0
    if-ne p1, v1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    move-object p1, v3

    .line 82
    :goto_1
    if-ne p1, v1, :cond_4

    .line 83
    .line 84
    return-object v1

    .line 85
    :cond_4
    return-object v3
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
