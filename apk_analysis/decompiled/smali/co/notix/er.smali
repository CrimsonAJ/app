.class public final Lco/notix/er;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LO7/l;

.field public b:Lg8/a;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LO7/l;)V
    .locals 1

    .line 1
    const-string v0, "initializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lco/notix/er;->a:LO7/l;

    .line 10
    .line 11
    invoke-static {}, Lg8/e;->a()Lg8/d;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lco/notix/er;->b:Lg8/a;

    .line 16
    .line 17
    return-void
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
.end method


# virtual methods
.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lco/notix/dr;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/dr;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/dr;->e:I

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
    iput v1, v0, Lco/notix/dr;->e:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/dr;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/dr;-><init>(Lco/notix/er;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/dr;->c:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/dr;->e:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v4, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object v1, v0, Lco/notix/dr;->b:Lg8/a;

    .line 41
    .line 42
    iget-object v0, v0, Lco/notix/dr;->a:Lco/notix/er;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_3

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    iget-object v2, v0, Lco/notix/dr;->b:Lg8/a;

    .line 59
    .line 60
    iget-object v4, v0, Lco/notix/dr;->a:Lco/notix/er;

    .line 61
    .line 62
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object p1, v2

    .line 66
    goto :goto_1

    .line 67
    :cond_3
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lco/notix/er;->b:Lg8/a;

    .line 71
    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    iget-object p1, p0, Lco/notix/er;->c:Ljava/lang/Object;

    .line 75
    .line 76
    return-object p1

    .line 77
    :cond_4
    iput-object p0, v0, Lco/notix/dr;->a:Lco/notix/er;

    .line 78
    .line 79
    iput-object p1, v0, Lco/notix/dr;->b:Lg8/a;

    .line 80
    .line 81
    iput v4, v0, Lco/notix/dr;->e:I

    .line 82
    .line 83
    invoke-interface {p1, v0}, Lg8/a;->d(LG7/c;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-ne v2, v1, :cond_5

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_5
    move-object v4, p0

    .line 91
    :goto_1
    :try_start_1
    iget-object v2, v4, Lco/notix/er;->a:LO7/l;

    .line 92
    .line 93
    if-nez v2, :cond_6

    .line 94
    .line 95
    iget-object v0, v4, Lco/notix/er;->c:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    .line 97
    invoke-interface {p1, v5}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object v0

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object v1, p1

    .line 103
    move-object p1, v0

    .line 104
    goto :goto_4

    .line 105
    :cond_6
    :try_start_2
    iput-object v4, v0, Lco/notix/dr;->a:Lco/notix/er;

    .line 106
    .line 107
    iput-object p1, v0, Lco/notix/dr;->b:Lg8/a;

    .line 108
    .line 109
    iput v3, v0, Lco/notix/dr;->e:I

    .line 110
    .line 111
    invoke-interface {v2, v0}, LO7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 115
    if-ne v0, v1, :cond_7

    .line 116
    .line 117
    :goto_2
    return-object v1

    .line 118
    :cond_7
    move-object v1, p1

    .line 119
    move-object p1, v0

    .line 120
    move-object v0, v4

    .line 121
    :goto_3
    :try_start_3
    iput-object p1, v0, Lco/notix/er;->c:Ljava/lang/Object;

    .line 122
    .line 123
    iput-object v5, v0, Lco/notix/er;->a:LO7/l;

    .line 124
    .line 125
    iput-object v5, v0, Lco/notix/er;->b:Lg8/a;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 126
    .line 127
    invoke-interface {v1, v5}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object p1

    .line 131
    :goto_4
    invoke-interface {v1, v5}, Lg8/a;->a(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    throw p1
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
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
