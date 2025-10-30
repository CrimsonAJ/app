.class public abstract LM1/r;
.super Landroidx/lifecycle/e0;
.source "SourceFile"


# instance fields
.field public final d:Lb8/L;

.field public final e:Lb8/Q;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/e0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    invoke-static {v0}, Lb8/M;->b(I)Lb8/L;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LM1/r;->d:Lb8/L;

    .line 10
    .line 11
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-static {v0}, Lb8/M;->c(Ljava/lang/Object;)Lb8/Q;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LM1/r;->e:Lb8/Q;

    .line 18
    .line 19
    return-void
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


# virtual methods
.method public final d(ZLO7/p;)LY7/y0;
    .locals 3

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/Y;->g(LM1/r;)LY7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LM1/p;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p1, p0, p2, v2}, LM1/p;-><init>(ZLM1/r;LO7/p;LE7/d;)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x3

    .line 12
    invoke-static {v0, v2, v1, p1}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
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

.method public final e(LM1/E;LE7/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LM1/r;->d:Lb8/L;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lb8/L;->emit(Ljava/lang/Object;LE7/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object p2, LF7/a;->a:LF7/a;

    .line 8
    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 13
    .line 14
    return-object p1
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

.method public final f(Ljava/lang/Throwable;LE7/d;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, LM1/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LM1/q;

    .line 7
    .line 8
    iget v1, v0, LM1/q;->v:I

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
    iput v1, v0, LM1/q;->v:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LM1/q;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LM1/q;-><init>(LM1/r;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LM1/q;->t:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, LM1/q;->v:I

    .line 30
    .line 31
    sget-object v3, LA7/n;->a:LA7/n;

    .line 32
    .line 33
    const/4 v4, 0x4

    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v2, :cond_5

    .line 38
    .line 39
    if-eq v2, v7, :cond_4

    .line 40
    .line 41
    if-eq v2, v6, :cond_3

    .line 42
    .line 43
    if-eq v2, v5, :cond_2

    .line 44
    .line 45
    if-ne v2, v4, :cond_1

    .line 46
    .line 47
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-object v3

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object v3

    .line 63
    :cond_3
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_4
    iget-object p1, v0, LM1/q;->s:Ljava/lang/Throwable;

    .line 68
    .line 69
    iget-object v2, v0, LM1/q;->r:LM1/r;

    .line 70
    .line 71
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    iput-object p0, v0, LM1/q;->r:LM1/r;

    .line 79
    .line 80
    iput-object p1, v0, LM1/q;->s:Ljava/lang/Throwable;

    .line 81
    .line 82
    iput v7, v0, LM1/q;->v:I

    .line 83
    .line 84
    invoke-static {v0}, Ll6/b;->m(LG7/c;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-ne p2, v1, :cond_6

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    move-object v2, p0

    .line 92
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-eqz p2, :cond_7

    .line 99
    .line 100
    invoke-static {}, Lu6/b;->a()Lu6/b;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2, p1}, Lu6/b;->b(Ljava/lang/Throwable;)V

    .line 105
    .line 106
    .line 107
    :cond_7
    instance-of p2, p1, Lu2/c;

    .line 108
    .line 109
    const/4 v7, 0x0

    .line 110
    if-eqz p2, :cond_8

    .line 111
    .line 112
    new-instance p1, LM1/D;

    .line 113
    .line 114
    const p2, 0x7f140143

    .line 115
    .line 116
    .line 117
    invoke-direct {p1, p2}, LM1/D;-><init>(I)V

    .line 118
    .line 119
    .line 120
    iput-object v7, v0, LM1/q;->r:LM1/r;

    .line 121
    .line 122
    iput-object v7, v0, LM1/q;->s:Ljava/lang/Throwable;

    .line 123
    .line 124
    iput v6, v0, LM1/q;->v:I

    .line 125
    .line 126
    invoke-virtual {v2, p1, v0}, LM1/r;->e(LM1/E;LE7/d;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v1, :cond_c

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_8
    instance-of p2, p1, Lu2/b;

    .line 134
    .line 135
    if-eqz p2, :cond_9

    .line 136
    .line 137
    new-instance p1, LM1/D;

    .line 138
    .line 139
    const p2, 0x7f14014a

    .line 140
    .line 141
    .line 142
    invoke-direct {p1, p2}, LM1/D;-><init>(I)V

    .line 143
    .line 144
    .line 145
    iput-object v7, v0, LM1/q;->r:LM1/r;

    .line 146
    .line 147
    iput-object v7, v0, LM1/q;->s:Ljava/lang/Throwable;

    .line 148
    .line 149
    iput v5, v0, LM1/q;->v:I

    .line 150
    .line 151
    invoke-virtual {v2, p1, v0}, LM1/r;->e(LM1/E;LE7/d;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    if-ne p1, v1, :cond_c

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    if-eqz p1, :cond_b

    .line 163
    .line 164
    invoke-static {p1}, LW7/d;->U(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result p2

    .line 168
    if-eqz p2, :cond_a

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_a
    new-instance p2, LM1/C;

    .line 172
    .line 173
    invoke-direct {p2, p1}, LM1/C;-><init>(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_b
    :goto_2
    new-instance p2, LM1/D;

    .line 178
    .line 179
    const p1, 0x7f140180

    .line 180
    .line 181
    .line 182
    invoke-direct {p2, p1}, LM1/D;-><init>(I)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iput-object v7, v0, LM1/q;->r:LM1/r;

    .line 186
    .line 187
    iput-object v7, v0, LM1/q;->s:Ljava/lang/Throwable;

    .line 188
    .line 189
    iput v4, v0, LM1/q;->v:I

    .line 190
    .line 191
    invoke-virtual {v2, p2, v0}, LM1/r;->e(LM1/E;LE7/d;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-ne p1, v1, :cond_c

    .line 196
    .line 197
    :goto_4
    return-object v1

    .line 198
    :cond_c
    return-object v3
    .line 199
.end method
