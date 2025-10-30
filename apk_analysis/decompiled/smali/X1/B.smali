.class public final synthetic LX1/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/q;


# instance fields
.field public final synthetic a:LX1/F;


# direct methods
.method public synthetic constructor <init>(LX1/F;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LX1/B;->a:LX1/F;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, LH2/g;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    const-string v0, "continueWatch"

    .line 16
    .line 17
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, LX1/B;->a:LX1/F;

    .line 21
    .line 22
    iget-object v1, p1, LH2/g;->i:Lcom/anilab/domain/model/Movie;

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    iget-object p1, p1, LH2/g;->c:Ljava/lang/Long;

    .line 28
    .line 29
    if-nez p1, :cond_1

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    iget-wide v1, v1, Lcom/anilab/domain/model/Movie;->a:J

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p1, p2

    .line 41
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    iget-object v2, v0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v3

    .line 50
    invoke-virtual {v2}, Lcom/anilab/android/ui/home/HomeFragment;->y0()LX1/y;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v2, LX1/w;

    .line 58
    .line 59
    invoke-direct {v2, p1, v3, v4, p2}, LX1/w;-><init>(LX1/y;JLE7/d;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v1, v2}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 63
    .line 64
    .line 65
    :cond_2
    if-eqz p3, :cond_6

    .line 66
    .line 67
    iget-object p1, v0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 68
    .line 69
    invoke-virtual {p1}, LM1/B;->r0()LL1/S;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    sget-object p3, Lb2/m;->b:Lb2/m;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, LL1/P;

    .line 79
    .line 80
    invoke-direct {v0, p3, v1, p1, p2}, LL1/P;-><init>(Lb2/n;ZLL1/S;LE7/d;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, LM1/r;->d(ZLO7/p;)LY7/y0;

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_3
    iget-object p2, v0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    if-nez v1, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    new-instance v2, LH2/s;

    .line 96
    .line 97
    iget-object p1, p1, LH2/g;->d:Ljava/lang/Long;

    .line 98
    .line 99
    if-eqz p1, :cond_5

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 102
    .line 103
    .line 104
    move-result-wide v3

    .line 105
    :goto_1
    move-wide v6, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_5
    const-wide/16 v3, -0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :goto_2
    iget-object v8, v1, Lcom/anilab/domain/model/Movie;->c:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v9, v1, Lcom/anilab/domain/model/Movie;->b:Ljava/lang/String;

    .line 113
    .line 114
    iget-wide v4, v1, Lcom/anilab/domain/model/Movie;->a:J

    .line 115
    .line 116
    iget v3, v1, Lcom/anilab/domain/model/Movie;->g:I

    .line 117
    .line 118
    iget-object v10, v1, Lcom/anilab/domain/model/Movie;->d:Ljava/util/List;

    .line 119
    .line 120
    invoke-direct/range {v2 .. v10}, LH2/s;-><init>(IJJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p2, v2}, LM1/B;->t0(LH2/s;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_3
    sget-object p1, LA7/n;->a:LA7/n;

    .line 127
    .line 128
    return-object p1
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method
