.class public final LO2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC2/E;

.field public final b:LG2/f;


# direct methods
.method public constructor <init>(LC2/E;LG2/f;)V
    .locals 1

    .line 1
    const-string v0, "movieRepository"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "commentMapper"

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
    iput-object p1, p0, LO2/b;->a:LC2/E;

    .line 15
    .line 16
    iput-object p2, p0, LO2/b;->b:LG2/f;

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
.method public final a(JLjava/lang/String;LG7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p4, LO2/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, LO2/a;

    .line 7
    .line 8
    iget v1, v0, LO2/a;->u:I

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
    iput v1, v0, LO2/a;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LO2/a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, LO2/a;-><init>(LO2/b;LG7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, LO2/a;->s:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, LO2/a;->u:I

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
    iget-object p1, v0, LO2/a;->r:LO2/b;

    .line 37
    .line 38
    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

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
    invoke-static {p4}, La/a;->A(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iput-object p0, v0, LO2/a;->r:LO2/b;

    .line 54
    .line 55
    iput v3, v0, LO2/a;->u:I

    .line 56
    .line 57
    iget-object v3, p0, LO2/b;->a:LC2/E;

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    sget-object p4, LE2/d;->a:Lo7/y;

    .line 63
    .line 64
    new-instance v2, LC2/f;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    move-wide v4, p1

    .line 68
    move-object v6, p3

    .line 69
    invoke-direct/range {v2 .. v7}, LC2/f;-><init>(LC2/E;JLjava/lang/String;LE7/d;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v0}, LE2/d;->a(LO7/p;LE7/d;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p4

    .line 76
    if-ne p4, v1, :cond_3

    .line 77
    .line 78
    return-object v1

    .line 79
    :cond_3
    move-object p1, p0

    .line 80
    :goto_1
    check-cast p4, Lv2/c;

    .line 81
    .line 82
    instance-of p2, p4, Lv2/a;

    .line 83
    .line 84
    if-eqz p2, :cond_4

    .line 85
    .line 86
    check-cast p4, Lv2/a;

    .line 87
    .line 88
    iget-object p1, p4, Lv2/a;->a:Ljava/lang/Throwable;

    .line 89
    .line 90
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1

    .line 95
    :cond_4
    instance-of p2, p4, Lv2/b;

    .line 96
    .line 97
    if-eqz p2, :cond_5

    .line 98
    .line 99
    iget-object p1, p1, LO2/b;->b:LG2/f;

    .line 100
    .line 101
    check-cast p4, Lv2/b;

    .line 102
    .line 103
    iget-object p2, p4, Lv2/b;->a:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, Lcom/anilab/data/model/response/CommentResponse;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {p2}, LG2/f;->a(Lcom/anilab/data/model/response/CommentResponse;)LH2/c;

    .line 111
    .line 112
    .line 113
    move-result-object p1

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
