.class public final Li7/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll7/b;


# instance fields
.field public final synthetic a:I

.field public final b:Lz7/a;

.field public final c:Ll7/c;


# direct methods
.method public constructor <init>(Ll7/c;Lz7/a;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li7/L;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Li7/L;->c:Ll7/c;

    .line 6
    iput-object p2, p0, Li7/L;->b:Lz7/a;

    return-void
.end method

.method public constructor <init>(Lz7/a;Ll7/c;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Li7/L;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Li7/L;->b:Lz7/a;

    .line 3
    iput-object p2, p0, Li7/L;->c:Ll7/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Li7/L;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/L;->b:Lz7/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lz7/a;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Li7/b;

    .line 13
    .line 14
    iget-object v1, p0, Li7/L;->c:Ll7/c;

    .line 15
    .line 16
    iget-object v1, v1, Ll7/c;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LE7/i;

    .line 19
    .line 20
    new-instance v2, Lm7/g;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Lm7/g;-><init>(Li7/b;LE7/i;)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    iget-object v0, p0, Li7/L;->c:Ll7/c;

    .line 27
    .line 28
    iget-object v0, v0, Ll7/c;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LE7/i;

    .line 31
    .line 32
    iget-object v1, p0, Li7/L;->b:Lz7/a;

    .line 33
    .line 34
    invoke-interface {v1}, Lz7/a;->get()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, LX/h;

    .line 39
    .line 40
    new-instance v2, Li7/K;

    .line 41
    .line 42
    invoke-direct {v2, v0, v1}, Li7/K;-><init>(LE7/i;LX/h;)V

    .line 43
    .line 44
    .line 45
    return-object v2

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
