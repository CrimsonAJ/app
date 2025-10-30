.class public final synthetic LL1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/anilab/android/ui/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/anilab/android/ui/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, LL1/c;->a:I

    iput-object p1, p0, LL1/c;->b:Lcom/anilab/android/ui/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LL1/c;->b:Lcom/anilab/android/ui/activity/MainActivity;

    .line 2
    .line 3
    iget v1, p0, LL1/c;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 9
    .line 10
    new-instance v1, LL1/f;

    .line 11
    .line 12
    invoke-direct {v1, v0}, LL1/f;-><init>(Lcom/anilab/android/ui/activity/MainActivity;)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    sget v1, Lcom/anilab/android/ui/activity/MainActivity;->k0:I

    .line 17
    .line 18
    const-class v1, Landroid/net/ConnectivityManager;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method
