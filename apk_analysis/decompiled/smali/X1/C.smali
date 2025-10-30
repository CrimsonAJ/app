.class public final synthetic LX1/C;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LX1/F;


# direct methods
.method public synthetic constructor <init>(LX1/F;I)V
    .locals 0

    .line 1
    iput p2, p0, LX1/C;->a:I

    iput-object p1, p0, LX1/C;->b:LX1/F;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, LX1/C;->a:I

    .line 2
    .line 3
    check-cast p1, Lcom/anilab/domain/model/Movie;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LX1/C;->b:LX1/F;

    .line 14
    .line 15
    iget-object v0, v0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/home/HomeFragment;->z0(Lcom/anilab/domain/model/Movie;)V

    .line 18
    .line 19
    .line 20
    sget-object p1, LA7/n;->a:LA7/n;

    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_0
    if-eqz p1, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LX1/C;->b:LX1/F;

    .line 26
    .line 27
    iget-object v0, v0, LX1/F;->d:Lcom/anilab/android/ui/home/HomeFragment;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/anilab/android/ui/home/HomeFragment;->z0(Lcom/anilab/domain/model/Movie;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    sget-object p1, LA7/n;->a:LA7/n;

    .line 33
    .line 34
    return-object p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 36
    .line 37
    .line 38
.end method
