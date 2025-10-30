.class public final LN2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LC2/e;


# direct methods
.method public constructor <init>(LC2/e;)V
    .locals 1

    .line 1
    const-string v0, "malRepository"

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
    iput-object p1, p0, LN2/d;->a:LC2/e;

    .line 10
    .line 11
    return-void
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
.end method


# virtual methods
.method public final a(Ljava/lang/String;LG7/c;)Ljava/io/Serializable;
    .locals 7

    .line 1
    instance-of v0, p2, LN2/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LN2/c;

    .line 7
    .line 8
    iget v1, v0, LN2/c;->t:I

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
    iput v1, v0, LN2/c;->t:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LN2/c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LN2/c;-><init>(LN2/d;LG7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LN2/c;->r:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, LN2/c;->t:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :cond_2
    invoke-static {p2}, La/a;->A(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput v3, v0, LN2/c;->t:I

    .line 53
    .line 54
    iget-object p2, p0, LN2/d;->a:LC2/e;

    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v2, LE2/d;->a:Lo7/y;

    .line 60
    .line 61
    new-instance v2, LC2/d;

    .line 62
    .line 63
    invoke-direct {v2, p2, p1, v4}, LC2/d;-><init>(LC2/e;Ljava/lang/String;LE7/d;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, v0}, LE2/d;->a(LO7/p;LE7/d;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    if-ne p2, v1, :cond_3

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_3
    :goto_1
    check-cast p2, Lv2/c;

    .line 74
    .line 75
    instance-of p1, p2, Lv2/b;

    .line 76
    .line 77
    if-eqz p1, :cond_7

    .line 78
    .line 79
    check-cast p2, Lv2/b;

    .line 80
    .line 81
    iget-object p1, p2, Lv2/b;->a:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast p1, Lcom/anilab/data/model/response/MalResponse;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/anilab/data/model/response/MalResponse;->a:Ljava/util/List;

    .line 86
    .line 87
    new-instance p2, Ljava/util/ArrayList;

    .line 88
    .line 89
    const/16 v0, 0xa

    .line 90
    .line 91
    invoke-static {p1, v0}, LB7/m;->f0(Ljava/lang/Iterable;I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, Lcom/anilab/data/model/response/MalDataResponse;

    .line 113
    .line 114
    new-instance v1, LH2/p;

    .line 115
    .line 116
    iget-object v2, v0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    .line 117
    .line 118
    if-eqz v2, :cond_4

    .line 119
    .line 120
    new-instance v3, Ljava/lang/Integer;

    .line 121
    .line 122
    iget v2, v2, Lcom/anilab/data/model/response/MalListStatusResponse;->a:I

    .line 123
    .line 124
    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 125
    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_4
    move-object v3, v4

    .line 129
    :goto_3
    iget-object v2, v0, Lcom/anilab/data/model/response/MalDataResponse;->a:Lcom/anilab/data/model/response/MalListStatusResponse;

    .line 130
    .line 131
    if-eqz v2, :cond_5

    .line 132
    .line 133
    iget-object v2, v2, Lcom/anilab/data/model/response/MalListStatusResponse;->b:Ljava/lang/String;

    .line 134
    .line 135
    goto :goto_4

    .line 136
    :cond_5
    move-object v2, v4

    .line 137
    :goto_4
    iget-object v0, v0, Lcom/anilab/data/model/response/MalDataResponse;->b:Lcom/anilab/data/model/response/MalNodeResponse;

    .line 138
    .line 139
    iget-wide v5, v0, Lcom/anilab/data/model/response/MalNodeResponse;->a:J

    .line 140
    .line 141
    invoke-direct {v1, v3, v2, v5, v6}, LH2/p;-><init>(Ljava/lang/Integer;Ljava/lang/String;J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_6
    return-object p2

    .line 149
    :cond_7
    instance-of p1, p2, Lv2/a;

    .line 150
    .line 151
    if-eqz p1, :cond_8

    .line 152
    .line 153
    check-cast p2, Lv2/a;

    .line 154
    .line 155
    iget-object p1, p2, Lv2/a;->a:Ljava/lang/Throwable;

    .line 156
    .line 157
    invoke-static {p1}, La/a;->h(Ljava/lang/Throwable;)LA7/i;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    return-object p1

    .line 162
    :cond_8
    new-instance p1, LA7/b;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 165
    .line 166
    .line 167
    throw p1
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
