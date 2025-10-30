.class public final LO2/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC2/E;

.field public final b:LG2/s;


# direct methods
.method public constructor <init>(LC2/E;LG2/s;)V
    .locals 1

    .line 1
    const-string v0, "movieRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "movieMapper"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LO2/D;->a:LC2/E;

    .line 15
    .line 16
    iput-object p2, p0, LO2/D;->b:LG2/s;

    .line 17
    .line 18
    return-void
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
.method public final a(ILG7/c;Ljava/lang/String;)Ljava/io/Serializable;
    .locals 4

    .line 1
    instance-of v0, p2, LO2/C;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LO2/C;

    .line 7
    .line 8
    iget v1, v0, LO2/C;->u:I

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
    iput v1, v0, LO2/C;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LO2/C;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LO2/C;-><init>(LO2/D;LG7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LO2/C;->s:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, LO2/C;->u:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, LO2/C;->r:LO2/D;

    .line 37
    .line 38
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p0, v0, LO2/C;->r:LO2/D;

    .line 54
    .line 55
    iput v3, v0, LO2/C;->u:I

    .line 56
    .line 57
    iget-object p2, p0, LO2/D;->a:LC2/E;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object v2, LE2/d;->a:Lo7/y;

    .line 63
    .line 64
    new-instance v2, LC2/s;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v2, p1, p2, v3, p3}, LC2/s;-><init>(ILC2/E;LE7/d;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v0}, LE2/d;->a(LO7/p;LE7/d;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object p1, p0

    .line 78
    :goto_1
    check-cast p2, Lv2/c;

    .line 79
    .line 80
    instance-of p3, p2, Lv2/a;

    .line 81
    .line 82
    if-eqz p3, :cond_4

    .line 83
    .line 84
    check-cast p2, Lv2/a;

    .line 85
    .line 86
    iget-object p1, p2, Lv2/a;->a:Ljava/lang/Throwable;

    .line 87
    .line 88
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    return-object p1

    .line 93
    :cond_4
    instance-of p3, p2, Lv2/b;

    .line 94
    .line 95
    if-eqz p3, :cond_5

    .line 96
    .line 97
    iget-object p1, p1, LO2/D;->b:LG2/s;

    .line 98
    .line 99
    check-cast p2, Lv2/b;

    .line 100
    .line 101
    iget-object p2, p2, Lv2/b;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p2, Ljava/util/List;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p2}, Ll6/b;->q(LG2/q;Ljava/util/List;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Ljava/io/Serializable;

    .line 113
    .line 114
    return-object p1

    .line 115
    :cond_5
    new-instance p1, LA7/b;

    .line 116
    .line 117
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 118
    .line 119
    .line 120
    throw p1
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
.end method
