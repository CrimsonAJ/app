.class public abstract Lco/notix/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/i3;

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/notix/i3;I)V
    .locals 1

    const-string v0, "adLoaderDelegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/notix/h3;->a:Lco/notix/i3;

    iput p2, p0, Lco/notix/h3;->b:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "randomUUID().toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/notix/h3;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lco/notix/e3;
    .locals 3

    iget-object v0, p0, Lco/notix/h3;->a:Lco/notix/i3;

    check-cast v0, Lco/notix/c4;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    new-instance v1, Lco/notix/q3;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lco/notix/q3;-><init>(Lco/notix/c4;LE7/d;)V

    .line 2
    sget-object v0, LE7/j;->a:LE7/j;

    .line 3
    invoke-static {v0, v1}, LY7/B;->v(LE7/i;LO7/p;)Ljava/lang/Object;

    move-result-object v0

    .line 4
    check-cast v0, Lco/notix/g;

    .line 5
    invoke-virtual {p0, v0}, Lco/notix/h3;->a(Lco/notix/g;)Lco/notix/e3;

    move-result-object v0

    return-object v0
.end method

.method public abstract a(Lco/notix/g;)Lco/notix/e3;
.end method

.method public final awaitNext(JLE7/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, Lco/notix/f3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lco/notix/f3;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/f3;->d:I

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
    iput v1, v0, Lco/notix/f3;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/f3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lco/notix/f3;-><init>(Lco/notix/h3;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lco/notix/f3;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/f3;->d:I

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
    iget-object p1, v0, Lco/notix/f3;->a:Lco/notix/h3;

    .line 37
    .line 38
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

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
    invoke-static {p3}, La/a;->A(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p3, p0, Lco/notix/h3;->a:Lco/notix/i3;

    .line 54
    .line 55
    iput-object p0, v0, Lco/notix/f3;->a:Lco/notix/h3;

    .line 56
    .line 57
    iput v3, v0, Lco/notix/f3;->d:I

    .line 58
    .line 59
    check-cast p3, Lco/notix/c4;

    .line 60
    .line 61
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, Lco/notix/o3;

    .line 65
    .line 66
    const/4 v3, 0x0

    .line 67
    invoke-direct {v2, p3, v3}, Lco/notix/o3;-><init>(Lco/notix/c4;LE7/d;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p1, p2, v2, v0}, LY7/B;->D(JLO7/p;LG7/c;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    if-ne p3, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    move-object p1, p0

    .line 78
    :goto_1
    check-cast p3, Lco/notix/g;

    .line 79
    .line 80
    invoke-virtual {p1, p3}, Lco/notix/h3;->a(Lco/notix/g;)Lco/notix/e3;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    return-object p1
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

.method public final doOnNextAvailable(LO7/l;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x1388

    invoke-virtual {p0, p1, v0, v1}, Lco/notix/h3;->doOnNextAvailable(LO7/l;J)V

    return-void
.end method

.method public final doOnNextAvailable(LO7/l;J)V
    .locals 7

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/notix/h3;->a:Lco/notix/i3;

    new-instance v2, Lco/notix/g3;

    invoke-direct {v2, p1, p0}, Lco/notix/g3;-><init>(LO7/l;Lco/notix/h3;)V

    move-object v3, v0

    check-cast v3, Lco/notix/c4;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    iget-object p1, v3, Lco/notix/c4;->c:LY7/z;

    new-instance v1, Lco/notix/p3;

    const/4 v6, 0x0

    move-wide v4, p2

    invoke-direct/range {v1 .. v6}, Lco/notix/p3;-><init>(LO7/l;Lco/notix/c4;JLE7/d;)V

    const/4 p2, 0x3

    const/4 p3, 0x0

    invoke-static {p1, p3, v1, p2}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    return-void
.end method

.method public bridge synthetic getNext()Lco/notix/appopen/AppOpenData;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lco/notix/h3;->a()Lco/notix/e3;

    move-result-object v0

    check-cast v0, Lco/notix/appopen/AppOpenData;

    return-object v0
.end method

.method public bridge synthetic getNext()Lco/notix/banner/BannerData;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lco/notix/h3;->a()Lco/notix/e3;

    move-result-object v0

    check-cast v0, Lco/notix/banner/BannerData;

    return-object v0
.end method

.method public bridge synthetic getNext()Lco/notix/interstitial/InterstitialData;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lco/notix/h3;->a()Lco/notix/e3;

    move-result-object v0

    check-cast v0, Lco/notix/interstitial/InterstitialData;

    return-object v0
.end method

.method public bridge synthetic getNext()Lco/notix/native/NativeData;
    .locals 1

    .line 4
    invoke-virtual {p0}, Lco/notix/h3;->a()Lco/notix/e3;

    move-result-object v0

    check-cast v0, Lco/notix/native/NativeData;

    return-object v0
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lco/notix/h3;->a:Lco/notix/i3;

    .line 2
    .line 3
    check-cast v0, Lco/notix/c4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, Lco/notix/r3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lco/notix/r3;-><init>(Lco/notix/c4;LE7/d;)V

    .line 12
    .line 13
    .line 14
    sget-object v0, LE7/j;->a:LE7/j;

    .line 15
    .line 16
    invoke-static {v0, v1}, LY7/B;->v(LE7/i;LO7/p;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    return v0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final startLoading()V
    .locals 7

    .line 1
    iget-object v0, p0, Lco/notix/h3;->a:Lco/notix/i3;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/h3;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, p0, Lco/notix/h3;->b:I

    .line 6
    .line 7
    check-cast v0, Lco/notix/c4;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v3, "loaderId"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v0, Lco/notix/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    iget-object v3, v0, Lco/notix/c4;->l:LY7/h0;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v3, v0, Lco/notix/c4;->c:LY7/z;

    .line 31
    .line 32
    new-instance v4, Lco/notix/a4;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-direct {v4, v0, v5}, Lco/notix/a4;-><init>(Lco/notix/c4;LE7/d;)V

    .line 36
    .line 37
    .line 38
    const/4 v6, 0x3

    .line 39
    invoke-static {v3, v5, v4, v6}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iput-object v3, v0, Lco/notix/c4;->l:LY7/h0;

    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v0, v0, Lco/notix/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    return-void
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method

.method public final stopLoading()V
    .locals 3

    .line 1
    iget-object v0, p0, Lco/notix/h3;->a:Lco/notix/i3;

    .line 2
    .line 3
    iget-object v1, p0, Lco/notix/h3;->c:Ljava/lang/String;

    .line 4
    .line 5
    check-cast v0, Lco/notix/c4;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string v2, "loaderId"

    .line 11
    .line 12
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v2, v0, Lco/notix/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lco/notix/c4;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, v0, Lco/notix/c4;->l:LY7/h0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-interface {v1, v2}, LY7/h0;->d(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    iput-object v2, v0, Lco/notix/c4;->l:LY7/h0;

    .line 37
    .line 38
    :cond_1
    return-void
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
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
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
.end method
